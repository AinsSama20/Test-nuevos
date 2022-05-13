package Tu_casa_ahora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CatalogoTest {
    WebDriver driver;

    WebDriverManager wdm = WebDriverManager.chromedriver().browserInDocker();
    // WebDriverManager wdm = WebDriverManager.firefoxdriver().browserInDocker();

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
        // Exercise
        driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com/detalle-catalogo/2");
        //driver.manage().window().maximize();
        //String title = driver.getTitle();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        // Verify
        //assertThat(title).contains("Tu Casa Ahora");

        try{
            Thread.sleep(10*1000);

            //Actions act = new Actions(driver);
            //act.moveToElement(driver.findElement(By.xpath("/html/body/app-root/app-home/app-detalle-catalogo-app/div[1]/div/div[1]/div/div/div[3]/div/div/div[1]/label")));

            //WebElement Element1 = driver.findElement(By.xpath("//select[@id='conc_id']"));
            //To select the first option
            //js.executeScript("arguments[0].scrollIntoView();", Element1);
            Thread.sleep(1*1000);

            Select select1 = new Select(driver.findElement(By.id("conc_id")));
            select1.selectByValue("1");
            Thread.sleep(1*1000);

            WebElement pers_documento = driver.findElement(By.id("pers_documento"));
            pers_documento.sendKeys("75739934");
            Thread.sleep(1*1000);

            WebElement pers_nombres = driver.findElement(By.id("pers_nombres"));
            pers_nombres.sendKeys("Alexander Sosa Ruiz");
            Thread.sleep(1*1000);

            WebElement pers_email = driver.findElement(By.id("pers_email"));
            pers_email.sendKeys("fsosa@ide-solution.com");
            Thread.sleep(1*1000);

            WebElement pers_celular = driver.findElement(By.id("pers_celular"));
            pers_celular.sendKeys("927022672");
            Thread.sleep(1*1000);

            WebElement exampleFormControlTextarea1 = driver.findElement(By.id("exampleFormControlTextarea1"));
            exampleFormControlTextarea1.sendKeys("necesito informacion");
            Thread.sleep(1*1000);

            //<WebElement> elements = driver.findElements(By.tagName("button"));
            //System.out.println("Number of elements:" +elements.size());
            //Thread.sleep(1*1000);

            //for (int i=0; i<elements.size();i++){
            //    if(i==9){
            //        elements.get(i).click();
            //        Thread.sleep(1*1000);
            //    }
            //}
            Thread.sleep(1*1000);

            WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-detalle-catalogo-app/div[1]/div/div[1]/div/div/div[3]/div/div/div[6]/button"));
            js.executeScript("arguments[0].scrollIntoView();", button);
            button.sendKeys(Keys.RETURN);
            Thread.sleep(1*1000);

            /*WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-home/app-detalle-catalogo-app/div[1]/div/div[1]/div/div/div[3]/div/div/div[6]/button"));
            js.executeScript("arguments[0].scrollIntoView();", button);
            button.sendKeys(Keys.RETURN);
            Thread.sleep(1*1000);
*/

            System.out.println("Test Finalizado");
            Thread.sleep(10*1000);

        }catch(Throwable e){
            System.out.println("Error found: "+e.getMessage());
        }


    }
}
