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
            sessionStorage.setItem('usuario', usuario);
            alert('Login bem-sucedido!');
            window.location.href = "../inicio/inicio2";
        } else {
            alert('Login ou senha incorretos. Tente novamente.');
        }
    })
    .catch(error => {
        console.error('Erro ao fazer login:', error);
    });
}


const usuario = sessionStorage.getItem('usuario');
if (usuario) {
    alert('Usuário autenticado: ' + usuario);
    window.location.href = "../inicio/inicio2";
}