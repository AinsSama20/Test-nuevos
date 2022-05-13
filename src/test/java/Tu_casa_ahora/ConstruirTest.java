package Tu_casa_ahora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
public class ConstruirTest {
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

        driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com/construir-inmueble");
        assertThat(driver.getTitle()).contains("Tu Casa Ahora");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try{

            Thread.sleep(20*1000);

            WebElement Element1 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-construir-inmueble/div[1]/div/div[3]/div/div[2]/div"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element1);
            Thread.sleep(1*1000);

            Select tipo_documento_propietario = new Select(driver.findElement(By.id("documentoConstruccion")));
            tipo_documento_propietario.selectByValue("4");
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

            WebElement si_sunarp = (driver.findElement(By.id("opcion_si")));
            si_sunarp.click();
            Thread.sleep(1*1000);

            Select tipo_contruccion = new Select(driver.findElement(By.xpath("//select[@id='tipo_construccion']")));
            tipo_contruccion.selectByValue("86");
            Thread.sleep(1*1000);

            Select departamento = new Select(driver.findElement(By.id("departamento")));
            departamento.selectByValue("1");
            Thread.sleep(1*1000);

            Select provincia = new Select(driver.findElement(By.id("provincia")));
            provincia.selectByValue("1");
            Thread.sleep(1*1000);

            Select dist_id = new Select(driver.findElement(By.id("distrito")));
            dist_id.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement direccion = (driver.findElement(By.id("direccion_cons")));
            direccion.sendKeys("Britaldo Gonzales 505");
            Thread.sleep(1*1000);

            WebElement area_propiedad = driver.findElement(By.id("area_propiedad"));
            area_propiedad.sendKeys("10000");
            Thread.sleep(1*1000);


            WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-construir-inmueble/div[1]/div/div[3]/div/div[2]/div/div[9]/div[8]/button"));
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
