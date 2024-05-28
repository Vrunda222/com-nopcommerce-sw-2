package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Verify the text ‘Register’
        Assert.assertEquals("Register", driver.findElement(By.xpath("//a[@class='ico-register']")).getText());
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Select gender radio button
        driver.findElement(By.id("gender-female")).click();
        //Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Vrunda");
        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Vyas");
        //Select Day Month and Year
        //select day
        WebElement dropdownForDay = driver.findElement(By.name("DateOfBirthDay"));
        Select dropdownDay = new Select(dropdownForDay);
        dropdownDay.selectByValue("22");
        //select month
        WebElement dropdownForMonth = driver.findElement(By.name("DateOfBirthMonth"));
        System.out.println(driver.findElement(By.name("DateOfBirthMonth")));
        Select dropdownMonth = new Select(dropdownForMonth);
        dropdownMonth.selectByVisibleText("March");
        //select year
        WebElement dropdownForYear = driver.findElement(By.name("DateOfBirthYear"));
        Select dropdownYear = new Select(dropdownForYear);
        dropdownYear.selectByValue("1930");
        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("vrundavyas0222@gmail.com");
        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("vrundavyas022");
        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("vrundavyas022");
        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();
        //Verify the text 'Your registration completed’
        Assert.assertEquals("Your registration completed", driver.findElement(By.className("result")).getText());
    }


    @After
    public void tearDown(){
        // closeBrowser();
    }
}
