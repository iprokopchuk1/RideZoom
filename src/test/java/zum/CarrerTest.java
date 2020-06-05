package zum;

import org.junit.Test;

public class CarrerTest extends BaseTest {

    private HomePage homePage;
    private CareerPage careerPage;
    private JobsPage jobsPage;

    @Test
    public void testCarrer() {

        homePage = new HomePage(driver);

        careerPage = homePage.clickCareerButton();

        jobsPage = careerPage.clickViewJobsButton();

        homePage = jobsPage.clickZumHomeButton();

//        Git hub test











    }




}
