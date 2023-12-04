document.addEventListener('DOMContentLoaded', function () {
    function carregarUltimoAgendamento() {
        const usuario = JSON.parse(sessionStorage.getItem('usuario'));
        if(usuario){
            const url = 'http://localhost:8080/ultimoAgendamento/'+usuario.idIdoso;

            fetch(url)
            .then(response => response.json())
            .then(data => {
                exibirUltimoAgendamento(data);
            })
            .catch(error => {
                console.error('Erro na requisição:', error);
            });
        }        
    }

    function exibirUltimoAgendamento(agendamento) {
        document.getElementById('local').innerText = agendamento.local;
        document.getElementById('atividade').innerText = agendamento.atividade;
        const dataContratacao = new Date(agendamento.dataContratacao);
        const dia = dataContratacao.getDate();
        const mes = dataContratacao.getMonth() + 1;
        const ano = dataContratacao.getFullYear();
        const dataFormatada = `${dia}/${mes}/${ano}`;
        document.getElementById('data').innerText = dataFormatada;
        document.getElementById('hora').innerText = agendamento.quantidadeHora;
       
        const url = 'http://localhost:8080/mostrarAcompanhantes/'+agendamento.idAgendamento;

        fetch(url)
        .then(response => response.json())
        .then(data => {
            document.getElementById('nome').innerText = data.nome;
        })
        .catch(error => {
            console.error('Erro na requisição:', error);
        });
    }


    carregarUltimoAgendamento();
});