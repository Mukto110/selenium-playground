import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String header = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
        System.out.println("Header: " + header);

        String message = driver.findElement(By.cssSelector("div[class='example'] p")).getText();
        System.out.println("Message: " + message);
    }
}
