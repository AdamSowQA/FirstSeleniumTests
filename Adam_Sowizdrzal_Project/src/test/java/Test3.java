import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Test to check a cxorrect registration of new user
public class Test3 {

    @Test
    void NewUserRegistration() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://34.171.101.114/");
        // button register
        WebElement registerPage = driver.findElement(By.linkText("register"));
        registerPage.click();
        // Username
        WebElement usernameInput = driver.findElement(By.id("user_login"));
        usernameInput.sendKeys("Keyboardmouse");
        // User Password
        WebElement newpasswordInput = driver.findElement(By.id("user_pass"));
        newpasswordInput.sendKeys("!softie!");
        // confirm password
        WebElement conpasswordInput = driver.findElement(By.id("user_confirm_password"));
        conpasswordInput.sendKeys("!softie!");
        // User Email
        WebElement useremailInput = driver.findElement(By.id("user_email"));
        useremailInput.sendKeys("asd123@gmail.com");
        // Submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(.,'Submit')]"));
        ((WebElement) submitButton).click();
        // verify register of a new user
        WebElement myaccountPage = driver.findElement(By.linkText("Moje konto"));
        myaccountPage.click();
        // Username
        WebElement usernameloginInput = driver.findElement(By.id("username"));
        usernameloginInput.sendKeys("Keyboardmouse");
        // password
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("!softie!");
        // login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        ((WebElement) loginButton).click();
        // Test that new user is logged in
        Assertions.assertTrue(driver.findElement(By.linkText("Wyloguj się")).isDisplayed());
    }
}
