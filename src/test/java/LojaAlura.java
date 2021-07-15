import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.Cadastro;
import pages.Comprar;
import pages.Login;
import pages.Pagamento;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LojaAlura {

    private AndroidDriver driver;
    private Login login;
    private Cadastro cadastro;
    private Comprar comprar;
    private Pagamento pagamento;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", "br.com.alura.aluraesporte");
        desiredCapabilities.setCapability("appActivity", "br.com.alura.aluraesporte.ui.activity.MainActivity");
        desiredCapabilities.setCapability("plataformVersion", "9.0");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = new Login(driver);
        cadastro = new Cadastro(driver);
        comprar = new Comprar(driver);
        pagamento = new Pagamento(driver);
    }

    @Test
    public void testeCadatro() {

        login.validaLogin();
        cadastro.validaCampoSenha();
        cadastro.cadastar();
        login.login();
        comprar.selecaoProduto();
        pagamento.efetuarPagamento();
        login.logoff();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}