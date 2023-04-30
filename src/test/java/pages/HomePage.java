package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {
    WebDriver driver;
    public HomePage(WebDriver driver)  {

        this.driver = driver;

    }

    public void acessarAplicacao(){
        driver.manage().window().maximize();
        driver.get("https://www.qazando.com.br/curso.html");
        esperarElementoEstarPresente((By.id("btn-ver-cursos")),10);
        Assert.assertEquals("Não Acessou a Aplicação",true,driver.findElement(By.id("btn-ver-cursos")).isDisplayed());


    }

    public void scroolDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver; // Código para fazer scrool na página
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // Código para fazer scrool na página
        Thread.sleep(2000); // Código para fazer scrool na página
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("testando@teste.com.br");
    }

    public void dou_enter_em_ganhar_cupom(){
        driver.findElement(By.id("email")).sendKeys((Keys.ENTER));
    }

    public void verificar_desconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 >span")).getText();
        Assert.assertEquals("O cupom está errado","QAZANDO15OFF",texto_cupom);
    }

}
