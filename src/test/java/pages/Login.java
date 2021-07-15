package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class Login {

    private AndroidDriver driver;

    public Login(AndroidDriver driver) {
        this.driver = driver;
    }

    public void validaLogin(){
        MobileElement nameUser = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_usuario");
        nameUser.sendKeys("jose vitor");
        MobileElement senhaNcad = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        senhaNcad.sendKeys("12345");
        MobileElement btnNLog = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
        btnNLog.click();

        validaMsg();

        MobileElement btnIndCad = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        btnIndCad.click();

    }
    public void login(){
        MobileElement el6 = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_usuario");
        el6.sendKeys("jose vitor");
        MobileElement el7 = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        el7.sendKeys("12345");
        MobileElement el8 = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/login_botao_logar");
        el8.click();
    }
    public void logoff(){

        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Deslogar");
        el15.click();
    }

    public void validaMsg(){
        MobileElement txtVal = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/mensagem_erro_login") ;
        String  warTx = txtVal.getAttribute("text");
        String warSpc = "Usuário ou senha inválidos";
        Assert.assertEquals(warTx,warSpc);
    }
}
