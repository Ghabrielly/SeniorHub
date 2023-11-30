document.addEventListener('DOMContentLoaded', function() {
});
// verificar nome dos inputs do formulário
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
const Icpf = document.querySelector("#cpf");
const Isenha = document.querySelector("#senha");

function cadastrar() {
	var sexo = 0;
	if(Igenero.value == 'masculino'){
		sexo = 1;
	}

    fetch("http://localhost:8080/salvarIdoso", { //rota de cadastro
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
            genero: sexo,
            endereco: Iendereco.value,
            hobbie:Ihobbie.value,
            senha: Isenha.value,
        })
    })
    .then(function (res) { 
		console.log(res)
		alert("Idoso cadastrado com sucesso!");
	})
    .catch(function (res) { 
		console.log(res) 
	})
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
