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

const usuario = JSON.parse(sessionStorage.getItem('usuario'));
const idAcompanhante = new URLSearchParams(window.location.search).get('id');
const IquantidadeHora = document.querySelector("#qntd_hora");
const valorHora = document.querySelector("#qntd_hora");
const Ilocal = document.querySelector("#local");
const IdataContratacao = document.querySelector("#data");
const Iatividade = document.querySelector("#atividade");

function contratar() {
    const quantidadeHoras = parseFloat(IquantidadeHora.value) || 0;
    const valorFinal = quantidadeHoras * 50; 

    fetch("http://localhost:8080/salvarAgendamento", {
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json' 
    },
    method: "POST",
    body: JSON.stringify({
        idIdoso: usuario.idIdoso,
        idAcompanhante: idAcompanhante,
        quantidadeHora: IquantidadeHora.value,
        valorHora: valorFinal,
        local: Ilocal.value,
        dataContratacao: IdataContratacao.value,
        atividade: Iatividade.value,
    })
})
.then(function (res) { 
    alert("Contratação realizada com sucesso!") 
    window.location.href = "../agendado";
})
.catch(function (res) {
    alert("Erro ao realizar contratação.");
})
}

function carregarDadosIdoso() {
    var urlParams = new URLSearchParams(window.location.search);
    var idParam = urlParams.get('id');

    const url = 'http://localhost:8080/mostrarAcompanhantes/'+idParam;

    fetch(url)
    .then(response => response.json())
    .then(data => {
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
});