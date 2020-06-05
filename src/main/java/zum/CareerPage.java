package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CareerPage extends BasePage {

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobsButton;

    public JobsPage clickViewJobsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(viewJobsButton));
        viewJobsButton.click();
        return new JobsPage(driver);

    }





















}


