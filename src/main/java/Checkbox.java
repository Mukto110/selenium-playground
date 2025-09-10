import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//form/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form/input[2]"));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }
    }
}
