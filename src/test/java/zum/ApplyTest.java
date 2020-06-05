package zum;

import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyTest extends BaseTest {


    @Test
    public void testApply() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        ApplyPage applyPage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyPage.inputFirstName(user.getFirstName());

        applyPage.inputLastName(user.getLasName());

        applyPage.inputEmail(user.getEmail());

        applyPage.inputPhoneNumber(user.getPhoneNumber());

        applyPage.inputZipCode(user.getZipCode());

        applyPage.inputRefferalCode(user.getReferralCode());

        applyPage.clickState();

        applyPage.selectState(1);





    }














    }
