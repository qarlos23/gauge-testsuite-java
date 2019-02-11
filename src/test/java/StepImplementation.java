import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class StepImplementation {

    @Step("Navigate to <url>")
    public void navigateTo(String url) {
        Driver.webDriver.get(url);
    }

    @Step("Verify element <element_name> is displayed")
    public void verifyPageWasLoad(String elementName) {
        assertTrue(Driver.webDriver.getTitle().contains(elementName));
    }
}