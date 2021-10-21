import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Supervisor_Login extends Base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        //Enter email address
        driver.findElement(By.xpath("//android.widget.EditText[@text='Email address']")).sendKeys("indianBranch1@yopmail.com");

        //Enter Password
        driver.findElement(By.xpath("//android.widget.EditText[@text='Enter your password']")).sendKeys("Admin 123");
         Thread.sleep(2000);
        //Click on Sign-in button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();

        //click on my orders section
        driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[108,2271][180,2343]']")).click();
        Thread.sleep(2000);
        //Scroll down till add to cart button
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().text(\"Order No: 3aec8\"))");
        Thread.sleep(8000);
        //Click on my order
        driver.findElement(By.xpath("//android.widget.TextView[@text='Order No: 3aec8']")).click();

    }
}
