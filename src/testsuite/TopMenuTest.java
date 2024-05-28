package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        //Verify the text ‘Computers’
        Assert.assertEquals("Computers", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).getText());
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        //Verify the text ‘Electronics’
        Assert.assertEquals("Electronics", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).getText());
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        //Verify the text ‘Apparel’
        Assert.assertEquals("Apparel", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).getText());
    }
    @Test
    public  void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        //Verify the text ‘Digital downloads’
        Assert.assertEquals("Digital downloads", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).getText());
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        //Verify the text ‘Books’
        Assert.assertEquals("Books", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).getText());
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        //Verify the text ‘Jewelry’
        Assert.assertEquals("Jewelry", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).getText());
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        //Verify the text ‘Gift Cards’
        Assert.assertEquals("Gift Cards", driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).getText());
    }

    @After
    public void tearDown(){
        // closeBrowser();
    }
}
