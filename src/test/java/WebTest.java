import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://next-dentist911.vercel.app/";
        driver.get(url)
            
        WebElement image = driver.findElement(By.cssSelector("img[src='/images/logo.png']"));
        if (image.isDisplayed()) {
            System.out.println("Изображение отображается корректно");
        } else {
            System.out.println("Изображение не отображается");
        }

        driver.quit();
    }
}
