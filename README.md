Projeto Login QA Automação

Projeto de automação de testes desenvolvido para praticar Java, Maven, Selenium WebDriver, JUnit, Cucumber e Page Object Model (POM).

Ferramentas Utilizadas

'Java 21' , Maven, Selenium, WebDriver, JUnit 4, Cucumber, Page Object Model (POM),Git e GitHub

Estrutura do Projeto

LoginPage.java - Page Object da tela de login

AppTest.java - Testes automatizados com JUnit

LoginSteps.java - Implementação dos Steps do Cucumber

RunnerTest.java - Executor dos cenários Cucumber

login.feature - Cenários escritos em Gherkin

Cenários Automatizados

##Login válido

* Acessar a tela de login
* Informar e-mail válido
* Informar senha válida
* Validar mensagem de sucesso

##Login inválido

* Acessar a tela de login
* Informar e-mail válido
* Informar senha inválida
* Validar mensagem de erro

Como executar

Abra o terminal na raiz do projeto e execute:

'mvn test'

Autor
Desenvolvido por Lutzenberg para estudos e prática de automação de testes com Java, Selenium, JUnit e Cucumber.
