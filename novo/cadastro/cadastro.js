document.addEventListener('DOMContentLoaded', function() {
});
// constantes que referenciam as tags html do formulário de cadastro
const Inome = document.querySelector("#nome");
const Iusuario = document.querySelector("#usuario");
const Iemail = document.querySelector("#email");
const Itelefone = document.querySelector("#telefone");
const Inascimento= document.querySelector("#nascimento");
const Igenero = document.querySelector("#genero");
const Iendereco = document.querySelector("#endereco");
const Ihobbie = document.querySelector("#Hobbie");
const Isupor = document.querySelector("#supo");
const Isuporte = document.querySelector("#Suporte");
const Isenha = document.querySelector("#senha");

// criou uma função usando o fetch para fazer uma requisição 
// post para enviar o json com as informações de cadastro para a api
function cadastrar() {
    fetch("http://localhost:8080/salvarIdoso", {
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
            hobbie:Ihobbie.value,
            // supsim: Isupsim.value,
            // supnao: Isupnao.value,
            // supor: Isupor.value,
            // suport: Isuport.value,
            // suporte: Isuporte.value,
            // contato: Icontato.value,
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
        Ihobbie.value = "";
        Isupor.value = "";
        Isuport.value = "";
        Isuporte.value = "";
        Isenha.value = "";
        };
    