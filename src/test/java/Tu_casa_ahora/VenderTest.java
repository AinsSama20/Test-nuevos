package Tu_casa_ahora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class VenderTest {
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

        // driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com/vender-inmueble");
        driver.get("https://tu-casa-ahora2-qa.ide-solution.com/vender-inmueble");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try{

            Thread.sleep(10*1000);

            WebElement Element1 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-vender-inmueble/div[1]/div/div[3]/div/div[1]/label"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element1);
            Thread.sleep(1*1000);

            WebElement flexCheckDefault = driver.findElement(By.id("flexCheckDefault"));
            flexCheckDefault.click();
            Thread.sleep(1*1000);

            WebElement numero = (driver.findElement(By.id("numero")));
            numero.sendKeys("75739934");
            Thread.sleep(1*1000);

            Select tipo_inmueble = new Select(driver.findElement(By.id("tipo_inmueble")));
            tipo_inmueble.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement tamanio_inmueble = (driver.findElement(By.id("tamanio_inmueble")));
            tamanio_inmueble.sendKeys("10000");
            Thread.sleep(1*1000);

            WebElement antiguedad = (driver.findElement(By.id("antiguedad")));
            antiguedad.sendKeys("1");
            Thread.sleep(1*1000);

            WebElement n_habitaciones = (driver.findElement(By.id("n_habitaciones")));
            n_habitaciones.sendKeys("1");
            Thread.sleep(1*1000);

            WebElement n_banio = (driver.findElement(By.id("n_banio")));
            n_banio.sendKeys("1");
            Thread.sleep(1*1000);

            Select departamento = new Select(driver.findElement(By.id("departamento")));
            departamento.selectByValue("1");
            Thread.sleep(1*1000);

            Select provincia = new Select(driver.findElement(By.id("provincia")));
            provincia.selectByValue("1");
            Thread.sleep(1*1000);

            Select dist_id = new Select(driver.findElement(By.name("dist_id")));
            dist_id.selectByValue("010101");
            Thread.sleep(1*1000);

            WebElement direccion = (driver.findElement(By.id("direccion")));
            direccion.sendKeys("Britaldo Gonzales 505");
            Thread.sleep(1*1000);

            WebElement Element2 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-vender-inmueble/div[1]/div/div[3]/div/div[8]/div/agm-map/div[1]/div/div/div[2]/div[2]"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element2);
            Thread.sleep(1*1000);

            WebElement checkCaracteristica36 = (driver.findElement(By.id("checkCaracteristica36")));
            checkCaracteristica36.click();
            Thread.sleep(1*1000);

            WebElement checkServicio42 = (driver.findElement(By.id("checkServicio42")));
            checkServicio42.click();
            Thread.sleep(1*1000);

            WebElement comentario_inmueble = (driver.findElement(By.id("comentario_inmueble")));
            comentario_inmueble.sendKeys("Está casi nueva");
            Thread.sleep(1*1000);

            WebElement Element3 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-vender-inmueble/div[1]/div/div[5]/div"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element3);
            Thread.sleep(1*1000);

            Select tipo_documento = new Select(driver.findElement(By.id("tipo_documento")));
            tipo_documento.selectByValue("1");
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

            WebElement telefono_uno = driver.findElement(By.id("telefono_uno"));
            telefono_uno.sendKeys("927022672");
            Thread.sleep(1*1000);

            WebElement telefono_dos = driver.findElement(By.id("telefono_dos"));
            telefono_dos.sendKeys("927022673");
            Thread.sleep(1*1000);

            Select moneda = new Select(driver.findElement(By.id("moneda")));
            moneda.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement precio = driver.findElement(By.id("precio"));
            precio.sendKeys("1000");
            Thread.sleep(1*1000);

            WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-vender-inmueble/div[1]/div/div[6]/div/button"));
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
