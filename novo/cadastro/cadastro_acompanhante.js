document.addEventListener('DOMContentLoaded', function() {
});

const Inome = document.querySelector("#nome");
const Iusuario = document.querySelector("#usuario");
const Iemail = document.querySelector("#email");
const Itelefone = document.querySelector("#telefone");
const Inascimento= document.querySelector("#nascimento");
const Igenero = document.querySelector("#genero");
const Iendereco = document.querySelector("#endereco");
const Ihobbie = document.querySelector("#Hobbie");
const Iespecializacao = document.querySelector("#especializacao");
const Isenha = document.querySelector("#senha");

function cadastrar() {
    fetch("http://localhost:8080/salvarAcompanhante", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        method: "POST",
        body: JSON.stringify({
            nome: Inome.value,
            usuario: Iusuario.value,
            email: Iemail.value,
            telefone: Itelefone.value,
            nascimento: Inascimento.value,
            genero: Igenero.value,
            endereco: Iendereco.value,
            hobbies:Ihobbies.value,
            certificado: Icertificado.value,
            senha: Isenha.value,
          
        })
    })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) })
    }

    function limpar () {
        Inome.value = "";
        Isuario.value = "";
        Iemail.value = "";
        Itelefone.value = "";
        Inascimento.value = "";
        Igenero.value = "";
        Iendereco.value = "";
        Ihobbies.value = "";
        Icertificado.value = "";
        Isenha.value = "";
        };