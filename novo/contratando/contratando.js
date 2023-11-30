document.addEventListener('DOMContentLoaded', function() {
});

const Inome = document.querySelector("#nome");
const Iusuario = document.querySelector("#local");
const Iemail = document.querySelector("#data");
const Itelefone = document.querySelector("#hora");
const Inascimento= document.querySelector("#qntd_hora");
const Igenero = document.querySelector("#pagamento");
const Iendereco = document.querySelector("#valor_final");
const Isenha = document.querySelector("#senha");

function contratar() {
fetch("http://localhost:8080/salvarAgendamento", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        idIdoso: IidIdoso.value,
        idAcompanhante: IidAcompanhante.value,
        quantidadeHora: IquantidadeHora.value,
        valorHora: IvalorHora.value,
        local: Ilocal.value,
        dataContratacao: IdataContratacao.value,
      
    })
})
.then(function (res) { console.log(res) })
.catch(function (res) { console.log(res) })
}

function limpar () {
IidIdoso.value = "";
IidAcompanhante.value = "";
IquantidadeHora.value = "";
IvalorHora.value = "";
Ilocal.value = "";
IdataContratacao.value = "";
};

formulario.addEventListener('submit', function (event) {
event.preventDefault();

contratar();
limpar();
});
