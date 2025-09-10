import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;

public class BrokenImages {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");

        //Checking if I am in the right page
        String expectedTitle = "Broken Images";

        String actualTitle = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h3[1]")).getText();

        if (actualTitle.equals(expectedTitle))
            System.out.println("Title Matched");


        // Handling image 1
        WebElement image1 = driver.findElement(By.cssSelector("img[src='asdf.jpg']"));
        if (image1.getAttribute("naturalWidth").equals("0"))
            System.out.println("Broken image");
        else
            System.out.println("Not a broken image");


        // Handling image 2
        WebElement image2 = driver.findElement(By.cssSelector("img[src='hjkl.jpg']"));
        if (image2.getAttribute("naturalWidth").equals("0"))
            System.out.println("Broken image");
        else
            System.out.println("Not a broken image");

        // Handling image 3
        WebElement image3 = driver.findElement(By.cssSelector("img[src='img/avatar-blank.jpg']"));
        if (image3.getAttribute("naturalWidth").equals("0"))
            System.out.println("Broken image");
        else
            System.out.println("Not a broken image");



        // Check all images
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for (WebElement img : images){
            String src = img.getAttribute("src");
            int naturalWidth = Integer.parseInt(img.getAttribute("naturalWidth"));

            if (naturalWidth == 0)
                System.out.println("Broken Image: "+src);
            else
                System.out.println("Not Broken Image: "+src);
        }

        driver.quit();
    }
}
