package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobsPage extends BasePage {

    public JobsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "p a")
    private WebElement zumHomeButton;


    public HomePage clickZumHomeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(zumHomeButton));
        zumHomeButton.click();
        return new HomePage(driver);
    }








}
