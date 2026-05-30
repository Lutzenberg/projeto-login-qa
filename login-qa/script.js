const form = document.getElementById('loginForm');
const messageEl = document.getElementById('message');

form.addEventListener('submit', function (event) {
  event.preventDefault();

  const email = form.email.value.trim();
  const password = form.password.value.trim();

  if (!email || !password) {
    showMessage('Por favor, preencha todos os campos.', 'error');
    return;
  }

  if (validateEmail(email) && password.length >= 6) {
    showMessage('Login realizado com sucesso! 🚀', 'success');
    form.reset();
  } else {
    showMessage('E-mail ou senha inválidos. Verifique e tente novamente.', 'error');
  }
});

function validateEmail(email) {
  return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

function showMessage(text, type) {
  messageEl.textContent = text;
  messageEl.style.color = type === 'success' ? '#065f46' : '#b91c1c';
}
