function sair() {
    sessionStorage.clear();
    window.location.href = "../login";
}

const usuario = sessionStorage.getItem('usuario');
if (!usuario) {
    window.location.href = "../login";
}