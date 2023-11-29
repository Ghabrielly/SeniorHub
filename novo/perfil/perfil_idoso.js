document.addEventListener('DOMContentLoaded', function () {
    function carregarDadosAcompanhante() {
        const url = 'http://localhost:8080/mostrarIdosos/1';

        fetch(url)
            .then(response => response.json())
            .then(data => {
                exibirDadosAcompanhante(data);
            })
            .catch(error => {
                console.error('Erro na requisição:', error);
            });
    }

    function exibirDadosAcompanhante(acompanhante) {
        document.getElementById('usuariodois').innerText = acompanhante.usuario;
		document.getElementById('usuario').innerText = acompanhante.nome;
		document.getElementById('nome').innerText = acompanhante.nome;
        document.getElementById('email').innerText = acompanhante.email;
		document.getElementById('genero').innerText = acompanhante.genero;
		document.getElementById('endereco').innerText = acompanhante.endereco;
        document.getElementById('suporte').innerText = acompanhante.suporte;
        document.getElementById('telefone').innerText = acompanhante.telefone;
        document.getElementById('nascimento').innerText = acompanhante.nascimento;
        document.getElementById('hobbie').innerText = acompanhante.hobbie;
    }

    carregarDadosAcompanhante();
});
