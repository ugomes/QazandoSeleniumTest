package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import runner.RunCucumberTest;


public class DescontoStep extends RunCucumberTest {

    HomePage homepage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() {
      homepage.acessarAplicacao();
    }

        @Quando("^preencho meu email$")
        public void preencho_meu_email() throws InterruptedException {

        homepage.preencherEmail();

    }

        @E("^dou enter em ganhar cupom$")

        public void dou_enter_em_ganhar_cupom()  {
           homepage.dou_enter_em_ganhar_cupom();

        }

        @Então("^eu vejo o código de desconto$")
        public void verificar_desconto() {
            homepage.verificar_desconto();
        }


    }

