function sair() {
    sessionStorage.clear();
    window.location.href = "../login/index.html";
}

const usuario = sessionStorage.getItem('usuario');
if (!usuario) {
    window.location.href = "../login/index.html";
}