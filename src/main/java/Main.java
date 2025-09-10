import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        String url = driver.getCurrentUrl();
//        String title = driver.getTitle();
//
//        System.out.println(url);
//        System.out.println(title);

//        driver.navigate().to("https://www.google.com/advanced_search");
//        driver.navigate().back();
//        driver.navigate().refresh();
//        driver.navigate().forward();

//        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.cssSelector(".app_logo")).isDisplayed();

        driver.quit();
    }
}
