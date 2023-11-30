document.addEventListener('DOMContentLoaded', function () {
    function carregarDadosIdoso() {
        // var urlParams = new URLSearchParams(window.location.search);
        // var idParam = urlParams.get('id');
        // if (idParam !== null) {
        //     console.log('Valor do parâmetro "id":', idParam);
        // } else {
        //     console.log('Parâmetro "id" não encontrado na URL.');
        //     return
        // }        

        // const url = 'http://localhost:8080/mostrarIdosos/'+idParam;

        // fetch(url)
        // .then(response => response.json())
        // .then(data => {
        //     exibirDadosAcompanhante(data);
        // })
        // .catch(error => {
        //     console.error('Erro na requisição:', error);
        // });

        const data = sessionStorage.getItem('usuario');
        console.log(data)
        if (data) {
            exibirDadosIdoso(data);
        }
        
    }

    function exibirDadosIdoso(acompanhante) {
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

    carregarDadosIdoso();
});
