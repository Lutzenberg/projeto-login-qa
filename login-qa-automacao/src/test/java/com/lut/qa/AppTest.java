package com.lut.qa;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppTest {

    @Test
    public void devePreencherLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://127.0.0.1:5501/login-qa/index.html");

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("email")));

        driver.findElement(By.id("email"))
                .sendKeys("teste@gmail.com");

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("password")));

        driver.findElement(By.id("password"))
                .sendKeys("123456");

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.tagName("button")));

        driver.findElement(By.tagName("button"))
                .click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("message")));

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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://127.0.0.1:5501/login-qa/index.html");

        driver.findElement(By.id("email"))
                .sendKeys("teste@gmail.com");

        driver.findElement(By.id("password"))
                .sendKeys("123");

        driver.findElement(By.tagName("button"))
                .click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("message")));

        String mensagem = driver.findElement(By.id("message"))
                .getText();

        Assert.assertEquals(
                "E-mail ou senha inválidos. Verifique e tente novamente.",
                mensagem);

        driver.quit();
    }
}