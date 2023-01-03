import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    // Test Aplication operation when no password was provided when login in
    @Test
    void ShouldVerifyPositiveLogin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.171.101.114/");
        // 'Moje konto'
        WebElement goToMyAccountPage = driver.findElement(By.linkText("Moje konto"));
        goToMyAccountPage.click();
        //Fill the login
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("kierownik");
        //Login
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        ((WebElement) loginButton).click();




    }
}
