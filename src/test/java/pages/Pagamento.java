package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Pagamento {

    private AndroidDriver driver;

    public Pagamento(AndroidDriver driver) {
        this.driver = driver;
    }

    public void efetuarPagamento(){
        MobileElement numCad = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/" +
                "android.widget.FrameLayout/android.widget.EditText");
        numCad.sendKeys("1234123412341234");
        MobileElement valcad = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/" +
                "android.widget.FrameLayout/android.widget.EditText");
        valcad.sendKeys("0212");
        MobileElement cvc = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/" +
                "android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        cvc.sendKeys("123");
        MobileElement btnPg = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/" +
                "pagamento_botao_confirma_pagamento");
        btnPg.click();
        
        validaToast();
    }

    public void validaToast(){
        WebElement toastView = driver.findElement(By.xpath("//android.widget.Toast[1]"));
        String  toastTx = toastView.getAttribute("name");
        String textSpc = "Falha ao criar pagamento";
        Assert.assertEquals(toastTx,textSpc);
    }
}
