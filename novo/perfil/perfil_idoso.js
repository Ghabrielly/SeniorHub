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
        //document.getElementById('nascimento').innerText = idoso.nasc;
        document.getElementById('hobbie').innerText = idoso.hobbies;
        document.getElementById('hobbie').innerText = idoso.hobbie;
        const dataContratacao = new Date(idoso.nasc) | Date(idoso.nascimento);
        const dia = dataContratacao.getDate();
        const mes = dataContratacao.getMonth() + 1;
        const ano = dataContratacao.getFullYear();
        const dataFormatada = `${dia}/${mes}/${ano}`;
        document.getElementById('nascimento').innerText = dataFormatada;
    }

    const usuario = JSON.parse(sessionStorage.getItem('usuario'));
    if (!usuario) {
        window.location.href = "../login";
    }

    carregarDadosIdoso();

});

// function exibirDadosIdoso(idoso) {
//     const dataContratacao = new Date(agendamento.dataContratacao);
//     const dia = dataContratacao.getDate();
//     const mes = dataContratacao.getMonth() + 1;
//     const ano = dataContratacao.getFullYear();
//     const dataFormatada = `${dia}/${mes}/${ano}`;
//     document.getElementById('data').innerText = dataFormatada;
// }

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