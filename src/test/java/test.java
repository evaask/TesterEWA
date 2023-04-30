import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test extends PageSetUp {


    @Test
    public void testOne() {
        driver.findElementById("idExample").click();



        WebElement buttonSuccess = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("button success", buttonSuccess.getText());





    }
    }