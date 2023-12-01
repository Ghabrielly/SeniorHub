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
const Icertificado = document.querySelector("#especializacao");
const Icpf = document.querySelector("#cpf");
const Isenha = document.querySelector("#senha");
const Isobre = document.querySelector ("#sobre");

	
function cadastrar() {
    var sexo = 0;
	if(Igenero.value == 'masculino'){
		sexo = 1;
	}

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
            nasc: Inascimento.value,
            genero: sexo,
            endereco: Iendereco.value,
            hobbies:Ihobbie.value,
            certificado: Icertificado.value,
            senha: Isenha.value,
            cpf: Icpf.value,
            descricao: Isobre.value,
        })
    })
    .then(function (res) {
         console.log(res) 
         alert("Acompanhante Cadastrado!")
        })
    .catch(function (res) {
         console.log(res) 
        })
    }

    function limpar () {
        Inome.value = "";
        Iusuario.value = "";
        Iemail.value = "";
        Itelefone.value = "";
        Inascimento.value = "";
        Igenero.value = "";
        Iendereco.value = "";
        Ihobbie.value = "";
        Icertificado.value = "";
        Isenha.value = "";
        };