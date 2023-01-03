import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.function.BooleanSupplier;

// Test that checks if the vart is empty and then adds the product to the cart. Verify that the addition was successful
public class Test8 {
    @Test
    void CartVerification (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // main page
        driver.get("http://34.171.101.114/");
        // cart
        WebElement CartButton = driver.findElement(By.xpath("//ul[@id='site-header-cart']"));
        ((WebElement) CartButton).click();
        // chceck that cart is empty
        Assertions.assertTrue(driver.findElement(By.xpath("//article[@id='post-7']")).isDisplayed());
        // return to main page and add coin to cart
        WebElement ReturntoMainButton = driver.findElement(By.xpath("//a[@href='http://34.171.101.114']"));
        ((WebElement) ReturntoMainButton).click();
        WebElement AddtoCartButton = driver.findElement(By.xpath("//a[contains(text(),'Dodaj do koszyka')]"));
        ((WebElement) AddtoCartButton).click();
        // return to cart check that product is in a cart
        WebElement ReturntoCartButton = driver.findElement(By.xpath("//ul[@id='site-header-cart']"));
        ((WebElement) ReturntoCartButton).click();
        driver.navigate().refresh();
        Assertions.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Przejdź do płatności')]")).isDisplayed() );

    }
}
