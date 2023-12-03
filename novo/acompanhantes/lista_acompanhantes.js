document.addEventListener('DOMContentLoaded', function () {
    function carregarListaAcompanhantes() {
        const url = 'http://localhost:8080/acompanhate';

        fetch(url)
            .then(response => response.json())
            .then(data => {
                exibirListaAcompanhantes(data);
            })
            .catch(error => {
                console.error('Erro na requisição:', error);
            });
    }

    function exibirListaAcompanhantes(acompanhantes) {
        const providerListElement = document.getElementById('listaAcompanhantes');

        acompanhantes.forEach(provider => {
            const listItem = document.createElement('li');

            listItem.id = 'cardAcompanhante';

            listItem.innerHTML = `<div id="telinha">
            <div id="foto"> <img src="../Logos png/seniorHubLogoAzulClaroEscuro.svg" alt=""></div>
            
            <div id="nick">
                <label for="nome"></label>
                    <span id="nome">${provider.nome}</span>
            </div>
            
            <div id="hobbie">
                <label for="hobbie">Hobbie:</label>
                    <span id="hobbie">${provider.hobbies}</span>
            </div>
            <div id="describe">
                <label for="sobre">Sobre:</label>
                    <span id="sobre">${provider.descricao}</span>
                    <div>
            </div>            
        </div>
        <div id="eita">
            <div id="bot"><a id="but1" href="../contratando/index.html?id=${provider.idAcompanhante}">Contratar</a></div>
        </div>`;
            providerListElement.appendChild(listItem);
        });
    }

    carregarListaAcompanhantes();
});
