# language: pt

Funcionalidade: Login

  Cenário: Login válido

    Dado que estou na tela de login
    Quando informo email e senha válidos
    Então devo visualizar a mensagem de sucesso

      Cenário: Login inválido

    Dado que estou na tela de login
    Quando informo uma senha inválida
    Então devo visualizar uma mensagem de erro