package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pagamento {

    private AndroidDriver driver;

    public Pagamento(AndroidDriver driver) {
        this.driver = driver;
    }

    public void efetuarPagamento(){
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
        el11.sendKeys("1234123412341234");
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
        el12.sendKeys("0212");
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        el13.sendKeys("123");
        MobileElement el14 = (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento");
        el14.click();
        validaToast();
    }

    public void validaToast(){
        WebElement toastView = driver.findElement(By.xpath("//android.widget.Toast[1]"));
        String  toastTx = toastView.getAttribute("name");
        String textSpc = "Falha ao criar pagamento";
        Assert.assertEquals(toastTx,textSpc);
    }
}
