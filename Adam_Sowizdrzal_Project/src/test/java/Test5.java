import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// TEst, going from main page to "Kontakt" page
public class Test5 {
    @Test
    void GoingFromMainToKontakt (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // We are on main page
        driver.get("http://34.171.101.114/");
        // going to kontakt
        WebElement kontaktPage = driver.findElement(By.linkText("Kontakt"));
        kontaktPage.click();
        Assertions.assertTrue(driver.findElement(By.className("entry-title")).isDisplayed());
    }
}
