package zum;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    protected static User user;

    @BeforeClass
    public static void setUp() {

        System.out.println("Start");

        System.setProperty("webdriver.chrome.driver", "/Users/ilona/Desktop/Driver/chromedriver2");

        driver = new ChromeDriver();

        driver.get("https://www.ridezum.com//");

        driver.manage().window().fullscreen();

        String expectedTitle = "Zūm";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);


        user = new User("test@tt.sd", "Mary", "Scotts",
                "6543458899", "11106", "New York", "23742");


    }


    @AfterClass
    public static void tearDown() {

        System.out.println("Finish");

    }


}
