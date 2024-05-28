package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //click on the ‘Login’ link
        driver.findElement(By.className("ico-login")).click();
        //Verify the text ‘Welcome, Please Sign In!’
        Assert.assertEquals("Not redirected to login page","Welcome, Please Sign In!" , driver.findElement(By.xpath("//div/h1")).getText());
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter valid username
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vrundavyas022@gmail.com");
        //Enter valid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vrundavyas022");
        //Click on ‘LOGIN’ button
        driver.findElement(By.className("login-button")).click();
        //Verify the ‘Log out’ text is display
        Assert.assertEquals("Log out", driver.findElement(By.className("ico-logout")).getText());
    }
    @Test
    public void verifyTheErrorMessage(){
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();
        //Enter invalid username
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vrunda@gmail.com");
        //Enter invalid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
        //Click on Login button
        driver.findElement(By.className("login-button")).click();
        //Verify the error message
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",driver.findElement(By.className("validation-summary-errors")).getText());
    }
    @After
    public void tearDown(){
       // closeBrowser();
    }
}
