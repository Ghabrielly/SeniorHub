document.addEventListener('DOMContentLoaded', function () {
    function carregarDadosIdoso() {
        const data = JSON.parse(sessionStorage.getItem('usuario'));
        exibirDadosIdoso(data);
    }

    function exibirDadosIdoso(idoso) {
        document.getElementById('usuario2').innerText = idoso.usuario;
        document.getElementById('usuario').innerText = idoso.usuario;
        document.getElementById('nome').innerText = idoso.nome;
        document.getElementById('email').innerText = idoso.email;
        document.getElementById('genero').innerText = idoso.genero;
        document.getElementById('endereco').innerText = idoso.endereco;
        document.getElementById('cpf').innerText = idoso.cpf;
        document.getElementById('telefone').innerText = idoso.telefone;
        document.getElementById('nascimento').innerText = idoso.nascimento;
        document.getElementById('hobbie').innerText = idoso.hobbie;
    }

    const usuario = JSON.parse(sessionStorage.getItem('usuario'));
    if (!usuario) {
        window.location.href = "../login";
    }

    carregarDadosIdoso();

});

const usuario = JSON.parse(sessionStorage.getItem('usuario'));
if (!usuario) {
    window.location.href = "../login";
} else {
    if (usuario.idAcompanhante) {
        var menu = document.getElementById("eventos")
        if (menu) {
            menu.remove()
        }
    }
} if (usuario.idAcompanhante) {
    var menu = document.getElementById("acompanhantes")
    if (menu) {
        menu.remove()
    }
}

if (usuario.idAcompanhante) {
    var menu = document.getElementById("bot")
    if (menu) {
        menu.remove()
    }
}