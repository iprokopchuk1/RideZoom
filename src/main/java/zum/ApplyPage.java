package zum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".form-control")
    private List<WebElement> applyInput;

    @FindBy(css = ".ax-select-selected.placeholder")
    private WebElement stateSelection;

    @FindBy(css = "'.ax-select-items div'")
    private List<WebElement> stateList;

    @FindBy(css = "#ax-selector")
    private WebElement selectStateField;

    public void inputFirstName(String firstName)
    {
        applyInput.get(0).sendKeys(firstName);
    }

    public void inputLastName(String lastName)
    {

        applyInput.get(1).sendKeys(lastName);
    }

    public void inputEmail(String email)
    {

        applyInput.get(2).sendKeys(email);
    }

    public void inputPhoneNumber(String phoneNumber)
    {

        applyInput.get(3).sendKeys(phoneNumber);
    }

    public void inputZipCode(String zipCode) {
        applyInput.get(5).sendKeys(zipCode);
    }

    public void inputRefferalCode(String refferalCode) {
        applyInput.get(6).sendKeys(refferalCode);
    }

    public void clickState() {
        stateSelection.click();
    }

    public void selectState(int index) {
        Select select = new Select(selectStateField);
        select.selectByIndex(index);
    }









}
