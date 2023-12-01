document.addEventListener('DOMContentLoaded', function () {
    function carregarDadosIdoso() {
        const data = JSON.parse(sessionStorage.getItem('usuario'));
        exibirDadosIdoso(data);        
    }

    function exibirDadosIdoso(idoso) {
		document.getElementById('cpf').innerText = idoso.cpf;
        document.getElementById('usuario').innerText = idoso.usuario;
		document.getElementById('nome').innerText = idoso.nome;
        document.getElementById('email').innerText = idoso.email;
		document.getElementById('genero').innerText = idoso.genero;
		document.getElementById('endereco').innerText = idoso.endereco;
        document.getElementById('suporte').innerText = idoso.suporte;
        document.getElementById('telefone').innerText = idoso.telefone;
        document.getElementById('nascimento').innerText = idoso.nascimento;
        document.getElementById('hobbie').innerText = idoso.hobbie;
    }

    carregarDadosIdoso();
});
