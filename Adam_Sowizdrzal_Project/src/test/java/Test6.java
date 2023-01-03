import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Test going from login page to main page
public class Test6 {
    @Test
    void GoingFormLoginToMainPage(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Moje Konto/Login page
        driver.get("http://34.171.101.114/moje-konto/");
        //going to main page
        WebElement mainPage = driver.findElement(By.linkText("Strona główna"));
        mainPage.click();
        //check that we are on main page, by checkig that we see "Sklep" writing in middle of the page
        Assertions.assertTrue(driver.findElement(By.className("woocommerce-products-header")).isDisplayed());
    }
}
