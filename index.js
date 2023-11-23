document.addEventListener('DOMContentLoaded', function() {
});
const cadastro = document.querySelector("cadastro");
const Inome = document.querySelector(".nome");
const Iusuario = document.querySelector(".usuario");
const Iemail = document.querySelector(".email");
const Itelefone = document.querySelector(".telefone");
const Inascimento= document.querySelector(".nascimento");
const Igenero = document.querySelector(".genero");
const Iendereco = document.querySelector(".endereco");
const Ihobbie = document.querySelector(".hobbie");
const Isupor = document.querySelector(".supor");
const Isuport = document.querySelector(".suport");
const Isuporte = document.querySelector(".suporte");
const Isenha = document.querySelector(".senha");

function cadastrar() {
fetch("http://localhost:8080/usuarios", {
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
        hobbie:Ihobbie.value
        supsim: Isupsim.value
        supnao: Isupnao.value,
        supor: Isupor.value,
        suport: Isuport.value,
        suporte: Isuporte.value,
        contato: Icontato.value,
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

formulario.addEventListener('submit', function (event) {
event.preventDefault();

cadastrar();
limpar();
});


  document.addEventListener('DOMContentLoaded', function () {
    // Função para formatar a data
    function formatarData(datan) {
      // Verifica se a data está no formato esperado
      var regexData = /^\d{2}\/\d{2}\/\d{4}$/;
      if (!regexData.test(datan)) {
        alert('Formato de data inválido');
        return null;
      }

      // Divide a data em dia, mês e ano
      var partes = datan.split('/');
      var dia = partes[0];
      var mes = partes[1];
      var ano = partes[2];

      // Formata a data para o formato desejado (yyyy-mm-dd)
      var dataFormatada = ano + '-' + mes + '-' + dia;

      return dataFormatada;
    }

    // Adiciona evento de blur para formatar a data ao sair do campo de data
    document.querySelector('.nascimento').addEventListener('blur', function () {
      var dataFormatada = formatarData(this.value);
      if (dataFormatada) {
        this.value = dataFormatada;
      }
    });

  });
