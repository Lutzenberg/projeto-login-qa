package com.lut.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.Assert;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);

        driver.get("http://127.0.0.1:5501/login-qa/index.html");
    }

    @Quando("informo email e senha válidos")
    public void informoEmailESenhaValidos() {

        loginPage.preencherEmail("teste@gmail.com");

        loginPage.preencherSenha("123456");

        loginPage.clicarEntrar();
    }

    @Entao("devo visualizar a mensagem de sucesso")
    public void devoVisualizarAMensagemDeSucesso() {

        String mensagem = loginPage.obterMensagem();

        Assert.assertEquals(
                "Login realizado com sucesso! 🚀",
                mensagem);

        driver.quit();
    }
}