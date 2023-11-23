document.addEventListener('DOMContentLoaded', function() {
});
const cadastro = document.querySelector("cadastro");
const Ilogin = document.querySelector(".login");
const Isenha = document.querySelector(".senha");

function cadastrar() {
fetch("http://localhost:8080/usuarios", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        login: Ilogin.value,
        senha: Isenha.value,
      
    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

function limpar () {
Ilogin.value = "";
Isenha.value = "";
};

formulario.addEventListener('submit', function (event) {
event.preventDefault();

cadastrar();
limpar();
});


  document.addEventListener('DOMContentLoaded', function () {
   

  });
