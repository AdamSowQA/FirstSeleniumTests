import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// Checking thtat maiun page have logo and search pool
public class Test4 {
    @Test
    void CheckLogoAndSearchPool (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.171.101.114/");
        // Test that we have search pool
        Assertions.assertTrue(driver.findElement(By.id("woocommerce-product-search-field-0")).isDisplayed());
        // Test that we have logo on main page
        Assertions.assertTrue(driver.findElement(By.linkText("Metal Shop")).isDisplayed());
    }

}
