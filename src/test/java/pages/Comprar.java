package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Comprar {
    private AndroidDriver driver;

    public Comprar(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selecaoProduto(){
        MobileElement produto = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/" +
                "androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]");
        produto.click();
        MobileElement btnComprar= (MobileElement) driver.findElementById("br.com.alura.aluraesporte:id/" +
                "detalhes_produto_botao_comprar");
        btnComprar.click();
    }
}
