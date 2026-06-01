package com.lut.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By email = By.id("email");
    By password = By.id("password");
    By botaoEntrar = By.tagName("button");
    By mensagem = By.id("message");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmail(String texto) {
        driver.findElement(email).sendKeys(texto);
    }

    public void preencherSenha(String texto) {
        driver.findElement(password).sendKeys(texto);
    }

    public void clicarEntrar() {
        driver.findElement(botaoEntrar).click();
    }

    public String obterMensagem() {
        return driver.findElement(mensagem).getText();
    }
}