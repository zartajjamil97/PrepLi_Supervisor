import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Menu extends Base {
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

        //Click on menu
        driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[972,2271][1044,2343]']")).click();

        //Click on edit menu
        driver.findElement(By.xpath("//android.widget.TextView[@text='Edit Menu']")).click();
        Thread.sleep(2000);

        //Click on Instock dropdown
        driver.findElement(By.xpath("//android.widget.TextView[@text='InStock']")).click();

        Thread.sleep(2000);
        // click on out of stock button
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[754,2105][1316,2249]']")).click();

        Thread.sleep(2000);
        //Click on Unhide
        driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[1146,729][1392,801]']")).click();
        //Click on Yes
        driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();

        //Click on
        //driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[754,2105][1316,2249]']")).click();





    }
}
