import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC002 extends BaseTest {
    AllPages allPages;

    @Test
    public void test02() {
        allPages = new AllPages();
        allPages.mainPage().goToUrl(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().searchProduct("iphone");


    }
}