package Tu_casa_ahora;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class PrincipalTest {
    
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
    void test() throws InterruptedException {

        // driver.get("http://tu-casa-ahora2.s3-website-us-east-1.amazonaws.com");
        driver.get("https://tu-casa-ahora2-qa.ide-solution.com/");
        assertThat(driver.getTitle()).contains("Tu Casa Ahora");
        Thread.sleep(10*1000);

    }

}
