function sair() {
    sessionStorage.clear();
    window.location.href = "../login/index.html";
}

const usuario = JSON.parse(sessionStorage.getItem('usuario'));
if (!usuario) {
    window.location.href = "../login";
}else{
    if(usuario.idAcompanhante){
        var menu = document.getElementById("eventos")
        if(menu){
            menu.remove()
        }         
    }
}if(usuario.idAcompanhante){
    var menu = document.getElementById("acompanhantes")
    if(menu){
        menu.remove()
    }         
}