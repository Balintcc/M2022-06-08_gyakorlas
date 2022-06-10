import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickMethods {

    WebDriver driver;

    private final String  url = "https://demo.seleniumeasy.com/basic-checkbox-demo.html";

    private final By checkBox = By.xpath("//*[@id=\"isAgeSelected\"]");

    private final By text = By.xpath("//*[@id=\"txtAge\"]");

    public ClickMethods(WebDriver driver) {
        this.driver = driver;
    }
        public void navigateToPage() {
            driver.get(url);
        }
        public void clickCheckBox() {
            driver.findElement(checkBox).click();
        }
        public String getText() {
            String displayedText = driver.findElement(text).getText();
            return displayedText;
        }

}



