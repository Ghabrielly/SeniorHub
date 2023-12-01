function fazerLogin() {
    const usuario = document.getElementById('usuario').value;
    const senha = document.getElementById('senha').value;
    const tipoLogin = document.getElementById('tipoLogin').value;

    const dados = {
        usuario: usuario,
        senha: senha,
        tipoLogin: tipoLogin
    };

    fetch('http://localhost:8080/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(dados)
    })
    .then(response => {
        if (response.ok) {
            return response.json(); // Se a resposta for bem-sucedida, retorna os dados JSON
        } else {
            throw new Error('Login ou senha incorretos. Tente novamente.');
        }
    })
    .then(data => {
        // Verifica o tipo de usuário na resposta do backend
        const tipoUsuario = data.tipo; // Supondo que o tipo de usuário seja retornado pelo backend

        // Armazena o tipo de usuário na sessionStorage
        sessionStorage.setItem('tipoUsuario', tipoUsuario);

        // Redireciona com base no tipo de usuário
        if (tipoUsuario === 'acompanhante') {
            window.location.href = "../acompanhante.html";
        } else {
            window.location.href = "../inicio/inicio.html";
        }
    })
    .catch(error => {
        console.error('Erro ao fazer login:', error);
        alert(error.message);
    });
}
