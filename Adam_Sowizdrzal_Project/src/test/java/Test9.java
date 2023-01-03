import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Test that adds product to cart and next delete it, Verify that
public class Test9 {
    @Test
    void AddTocartRemoveFromCart (){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // main page
        driver.get("http://34.171.101.114/");
        // add to cart
        WebElement AddtoCartButton = driver.findElement(By.xpath("//a[contains(text(),'Dodaj do koszyka')]"));
        ((WebElement) AddtoCartButton).click();
        driver.navigate().refresh();
        // go to cart and delete product
        WebElement GoToCartButton = driver.findElement(By.xpath("//span[contains(.,'1 Produkt')]"));
        ((WebElement) GoToCartButton).click();
        WebElement DeleteProductButton = driver.findElement(By.xpath("//a[contains(text(),'×')]"));
        ((WebElement) DeleteProductButton).click();
        // Check that cart is empty //article[@id='post-7']
        Assertions.assertTrue(driver.findElement(By.xpath("//article[@id='post-7']")).isDisplayed());
        //Assertions.assertTrue(driver.findElement(By.xpath("//article[@id='post-7']")).isDisplayed());
    }
}
