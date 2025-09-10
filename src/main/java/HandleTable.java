import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom#delete");

        String expectedHeader = "Challenging DOM";
        String actualHeader = driver.findElement(By.cssSelector("div.example h3")).getText();
        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Matched");
        } else {
            System.out.println("Header didn't match");
        }

        List<WebElement> rows = driver.findElements(By.cssSelector("div.large-10.columns table tbody tr"));
        System.out.println("Number of data rows: " + rows.size());

        List<WebElement> firstRowCells = rows.get(0).findElements(By.tagName("td"));
        int columnCount = firstRowCells.size();
        System.out.println("Number of columns: " + columnCount);

        WebElement specificCell = rows.get(4).findElements(By.tagName("td")).get(0);
        String actualText = "Iuvaret4";
        String cellText = specificCell.getText().trim();

        if (cellText.equals(actualText)) {
            System.out.println("Text Matched: " + cellText);
        } else {
            System.out.println("Text didn't match. Actual: " + cellText);
        }

        System.out.println("\nFull Table Data:");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println();
        }

        driver.quit();
    }
}
