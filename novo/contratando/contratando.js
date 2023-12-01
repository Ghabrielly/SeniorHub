document.addEventListener('DOMContentLoaded', function() {
    const valorFixoPorHora = 50; 
    const inputQntdHora = document.getElementById('qntd_hora'); 
    const spanValorFinal = document.getElementById('valor_final'); 

   
    function calcularValorFinal() {
        const quantidadeHoras = parseFloat(inputQntdHora.value) || 0;

        const valorFinal = quantidadeHoras * valorFixoPorHora; 
          
        spanValorFinal.textContent = `R$ ${valorFinal.toFixed(2)}`;
    }

    inputQntdHora.addEventListener('input', calcularValorFinal);

    carregarDadosIdoso();
});

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
.catch(function (res) { console.log(res) 
    alert("Contratação realizada com sucesso!") })
}

function limpar () {
IidIdoso.value = "";
IidAcompanhante.value = "";
IquantidadeHora.value = "";
IvalorHora.value = "";
Ilocal.value = "";
IdataContratacao.value = "";
};

function carregarDadosIdoso() {
    var urlParams = new URLSearchParams(window.location.search);
    var idParam = urlParams.get('id');
    if (idParam !== null) {
        console.log('Valor do parâmetro "id":', idParam);
    } else {
        console.log('Parâmetro "id" não encontrado na URL.');
        return
    }    
    var acompanhante;
    const url = 'http://localhost:8080/mostrarAcompanhantes/'+idParam;

    fetch(url)
    .then(response => response.json())
    .then(data => {
        console.log(data)
        exibirDadosAcompanhante(data);
    })
    .catch(error => {
        console.error('Erro na requisição:', error);
    });
}

function exibirDadosAcompanhante(acompanhante){
    document.getElementById('nome').innerText = acompanhante.nome;
}

document.addEventListener('submit', function (event) {
event.preventDefault();

contratar();
limpar();
});







