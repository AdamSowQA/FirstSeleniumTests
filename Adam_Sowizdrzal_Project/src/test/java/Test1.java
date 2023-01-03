import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Test Aplication operation when no login was provided when login in
public class Test1 {
    @Test
    void ShouldVerifyPositiveLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.171.101.114/");
        //'Moje konto'
        WebElement goToMyAccountPage = driver.findElement(By.id("menu-item-125"));
        goToMyAccountPage.click();
        //Fill passowrd
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("!kinworeik!");
        //Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        ((WebElement) loginButton).click();



    }
}
