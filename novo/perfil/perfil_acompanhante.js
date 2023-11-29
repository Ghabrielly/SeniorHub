document.addEventListener('DOMContentLoaded', function () {
    function carregarDadosAcompanhante() {
        const url = 'http://localhost:8080/mostrarAcompanhantes/1';

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
        document.getElementById('usuarioum').innerText = acompanhante.nome;
		document.getElementById('usuariodois').innerText = acompanhante.nome;
		document.getElementById('nome').innerText = acompanhante.nome;
        document.getElementById('email').innerText = acompanhante.email;
		document.getElementById('genero').innerText = acompanhante.genero;
		document.getElementById('endereco').innerText = acompanhante.endereco;
        document.getElementById('especializacao').innerText = acompanhante.certificado;
        document.getElementById('telefone').innerText = acompanhante.telefone;
        document.getElementById('nascimento').innerText = acompanhante.nasc;
        document.getElementById('hobbie').innerText = acompanhante.hobbies;
    }

    carregarDadosAcompanhante();
});
