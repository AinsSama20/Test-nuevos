package Tu_casa_ahora;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuscarTest {
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

        // driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com");
        driver.get("https://tu-casa-ahora2-qa.ide-solution.com/");
        assertThat(driver.getTitle()).contains("Tu Casa Ahora");
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try{

            Thread.sleep(20*1000);

            WebElement Element1 = driver.findElement(By.xpath("/html/body/app-root/app-home/app-inicio-app/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/label"));

            // Scrolling down the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element1);
            Thread.sleep(1*1000);

            Select departamento = new Select(driver.findElement(By.id("departamento")));
            departamento.selectByValue("14");
            Thread.sleep(1*1000);

            Select provincia = new Select(driver.findElement(By.id("provincia")));
            provincia.selectByValue("125");
            Thread.sleep(1*1000);

            Select dist_id = new Select(driver.findElement(By.name("dist_id")));
            dist_id.selectByValue("1227");
            Thread.sleep(1*1000);

            Select tipo_contruccion = new Select(driver.findElement(By.xpath("/html/body/app-root/app-home/app-inicio-app/div/div/div[2]/div/div/div[1]/div[1]/div/div[5]/select")));
            tipo_contruccion.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement habitaciones = driver.findElement(By.id("habitaciones"));
            habitaciones.sendKeys("2");
            Thread.sleep(1*1000);

            WebElement banio = driver.findElement(By.id("banio"));
            banio.sendKeys("2");
            Thread.sleep(1*1000);

            WebElement precio_minimo = driver.findElement(By.id("precio_minimo"));
            precio_minimo.sendKeys("1");
            Thread.sleep(1*1000);

            WebElement precio_maximo = driver.findElement(By.id("precio_maximo"));
            precio_maximo.sendKeys("100000");
            Thread.sleep(1*1000);

            WebElement tamanio_minimo = driver.findElement(By.id("tamanio_minimo"));
            tamanio_minimo.sendKeys("1");
            Thread.sleep(1*1000);

            WebElement tamanio_maximo = driver.findElement(By.id("tamanio_maximo"));
            tamanio_maximo.sendKeys("100");
            Thread.sleep(1*1000);

            WebElement antiguedad = driver.findElement(By.id("antiguedad"));
            antiguedad.sendKeys("0");
            Thread.sleep(1*1000);

            WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-inicio-app/div/div/div[2]/div/div/div[1]/div[1]/div/div[11]/button"));
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
