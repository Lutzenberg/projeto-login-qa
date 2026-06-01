package com.lut.qa;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    @Test
    public void devePreencherLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5501/login-qa/index.html");

        Thread.sleep(3000);

        driver.findElement(By.id("email")).sendKeys("teste@gmail.com");

        Thread.sleep(3000);

        driver.findElement(By.id("password")).sendKeys("123456");

        Thread.sleep(3000);

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(10000);
        String mensagem = driver.findElement(By.id("message"))
                .getText();

        System.out.println(mensagem);
        Assert.assertEquals(
                "Login realizado com sucesso! 🚀",
                mensagem);

        driver.quit();
    }

    @Test
    public void deveMostrarErroComLoginInvalido() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5501/login-qa/index.html");

        driver.findElement(By.id("email"))
                .sendKeys("teste@gmail.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        Thread.sleep(3000);

        String mensagem = driver.findElement(By.id("message"))
                .getText();

        Assert.assertEquals(
                "E-mail ou senha inválidos. Verifique e tente novamente.",
                mensagem);

        driver.quit();
    }
}