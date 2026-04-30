

package utils;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {

	public static void capture(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Correct path (always points to project root)
            String path = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";

            File dest = new File(path);

            // Create folder if not exists
            dest.getParentFile().mkdirs();

            FileHandler.copy(src, dest);

            System.out.println("Screenshot saved at: " + path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}