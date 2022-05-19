package Tu_casa_ahora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class AsesoriaTest {
    WebDriver driver;
    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();

    @BeforeEach
    void setupTest() {
        driver = wdm.create();
    }

    @AfterEach
    void teardown() {
        wdm.quit();
    }
    @Test
     void test() {

        // driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com/asesorialegal");
        driver.get("https://tu-casa-ahora2-qa.ide-solution.com/asesorialegal");
        assertThat(driver.getTitle()).contains("Tu Casa Ahora");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try{

            Thread.sleep(20*1000);

            WebElement Element1 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-asesoria-legal-app/div[1]/div/div[3]/div/div[2]/div"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element1);

            Thread.sleep(1*1000);
            Select asesoria = new Select(driver.findElement(By.xpath("//select[@id='asesoria']")));
            asesoria.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement area_propiedad = driver.findElement(By.id("area_propiedad"));
            area_propiedad.sendKeys("10000");
            Thread.sleep(1*1000);

            Select tipo_inmueble = new Select(driver.findElement(By.id("tipo_inmueble")));
            tipo_inmueble.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement si_sunarp = (driver.findElement(By.id("si_sunarp")));
            si_sunarp.click();
            Thread.sleep(1*1000);

            WebElement descripcion_caso = driver.findElement(By.id("descripcion_caso"));
            descripcion_caso.sendKeys("Deseo vender");
            Thread.sleep(1*1000);

            WebElement Element2 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-asesoria-legal-app/div[1]/div/div[3]/div/div[2]/div/label"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element2);

            Select tipo_documento_propietario = new Select(driver.findElement(By.id("tipo_documento_propietario")));
            tipo_documento_propietario.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement n_documento = driver.findElement(By.id("n_documento"));
            n_documento.sendKeys("75739934");
            Thread.sleep(1*1000);

            WebElement nombres = driver.findElement(By.id("nombres"));
            nombres.sendKeys("Alexander Sosa Ruiz");
            Thread.sleep(1*1000);

            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("fsosa@ide-solution.com");
            Thread.sleep(1*1000);

            WebElement telefono = driver.findElement(By.id("telefono"));
            telefono.sendKeys("927022672");
            Thread.sleep(1*1000);

            WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-asesoria-legal-app/div[1]/div/div[3]/div/div[2]/div/div[15]/button"));
            js.executeScript("arguments[0].scrollIntoView();", button);
            button.sendKeys(Keys.RETURN);
            Thread.sleep(1*1000);

            System.out.println("Test Finalizado");

            Thread.sleep(10*1000);

        }catch(Throwable e){
            System.out.println("Error found: "+e.getMessage());
        }

    }
}
