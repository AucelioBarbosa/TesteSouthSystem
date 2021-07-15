package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class Cadastro {

    private AndroidDriver driver;

    public Cadastro(AndroidDriver android) {
        this.driver = android;
    }

    public void cadastar(){
        MobileElement nomeVal = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        nomeVal.sendKeys("jose vitor");
        MobileElement senhaVal = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        senhaVal.sendKeys("12345");
        MobileElement ConfSenha = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        ConfSenha.sendKeys("12345");
        MobileElement btnCadastrar = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        btnCadastrar.click();
    }

    public void validaCampoSenha(){
        MobileElement nomeval = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        nomeval.sendKeys("jose vitor");
        MobileElement senhaval = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        senhaval.sendKeys("10345");
        MobileElement ConfSenha = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");
        ConfSenha.sendKeys("12345");
        MobileElement btnCadastrar = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        btnCadastrar.click();

        validaMsg();

//        MobileElement btnCad = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
//        btnCad.click();
    }

    public void validaMsg(){

        MobileElement errCad =(MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        String msgVal = errCad.getAttribute("text");
        String erroSpc = "Senhas não conferem";

        Assert.assertEquals(msgVal,erroSpc);
    }
}
