package RentalAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RentalBooking1 {
	public static WebDriver driver;
	public static long StartTime;
	public static long EndTime;
	public static long TotalTimeTaken;

	@BeforeSuite
	public static void BeforeTest() {
		StartTime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@AfterSuite
	public static void AfterTest() throws InterruptedException {	
		driver.quit();
		long EndTtime = System.currentTimeMillis();
		long TotalTimeTaken = EndTtime - StartTime;
		System.out.println("The time Taken for this Testcase = " + TotalTimeTaken);
	}

	@Test(priority = 0)
	public static void Gotourl() throws InterruptedException {
		driver.get("https://www.economycarrentals.com/en-us");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
//		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public static void Country() throws InterruptedException {
		WebElement Country = driver.findElement(By.id("search-country"));
		org.openqa.selenium.support.ui.Select Value = new org.openqa.selenium.support.ui.Select(Country);
		Value.selectByValue("177");
		Thread.sleep(500);
	}
	
	@Test(priority = 2 )
	public static void City() throws InterruptedException {
		WebElement City=driver.findElement(By.id("search-city"));
		org.openqa.selenium.support.ui.Select value = new org.openqa.selenium.support.ui.Select(City);
		value.selectByVisibleText("Chennai");
		Thread.sleep(5000);
	}
@Test(priority = 3)
public static void Location() throws InterruptedException {
	WebElement Location = driver.findElement(By.id("search-location-pickup"));
	org.openqa.selenium.support.ui.Select Value = new org.openqa.selenium.support.ui.Select(Location);
	Value.selectByValue("5174;12735");


}


@Test(priority = 4)
public static void RentalStartdate() {
	
	WebElement Startdate = driver.findElement(By.id("search-rental-start-date"));
	Startdate.click();
	WebElement next = driver.findElement(By.className("next"));
	next.click();
	WebElement dateselect = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/table/tbody/tr[3]/td[6]"));
	dateselect.click();
}
@Test(priority = 5)
public static void RentalStartTime() {
	
	WebElement Starttime = driver.findElement(By.id("search-rental-start-time"));
	Starttime.click();
	WebElement timeselect = driver.findElement(By.xpath("//*[@id=\"search-rental-start-time\"]/option[13]"));
	timeselect.click();
}
@Test(priority = 6)
public static void RentalEndTime() {
	
	WebElement Endtime = driver.findElement(By.id("search-rental-end-time"));
	Endtime.click();
	WebElement timeselect1 = driver.findElement(By.xpath("//*[@id=\"search-rental-end-time\"]/option[33]"));
	timeselect1.click();
//	Thread.sleep(50);
}
@Test(priority = 7)
public static void Search() throws InterruptedException {
	
	
	WebElement search = driver.findElement(By.id("search-button"));
	Actions actions = new Actions(driver);
	actions.moveToElement(search).click().build().perform();
	Thread.sleep(5000);
}
@Test(priority = 8)
public static void Acceptpopup() throws InterruptedException {
	
	WebElement popup = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div[3]/button"));
    popup.click();
    Thread.sleep(2000);
}
@Test(priority = 9)
public static void Bookthecar() throws InterruptedException {
	
    WebElement bookcar=driver.findElement(By.xpath("//*[@id=\"car-deals\"]/article[1]/form/div/div[2]/div[3]/button"));
    bookcar.click();
    Thread.sleep(2000);
    
    JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollBy(0,250)");
	Thread.sleep(1000);
}
@Test(priority = 10)
public static void NexttoPay() throws InterruptedException {
	
	
    WebElement nexttopay = driver.findElement(By.id("options-submit"));
    nexttopay.click();
    Thread.sleep(1000);
    JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("window.scrollBy(0,250)");
}
@Test(priority = 11)
public static void DriverDetails() throws InterruptedException {
	 
     WebElement DFirstname = driver.findElement(By.xpath("//*[@id=\"checkout-form\"]/section[2]/div[2]/div/div[1]/div[1]/div/input"));
     DFirstname.sendKeys("John");
     WebElement Dsurname = driver.findElement(By.xpath("//*[@id=\"checkout-form\"]/section[2]/div[2]/div/div[1]/div[2]/div/input"));
     Dsurname.sendKeys("Daniel");
     WebElement DMno = driver.findElement(By.xpath("//*[@id=\"checkout-form\"]/section[2]/div[2]/div/div[2]/div[1]/input"));
     DMno.sendKeys("4567891230");
     WebElement Demail = driver.findElement(By.xpath("//*[@id=\"checkout-form\"]/section[2]/div[2]/div/div[2]/div[2]/input"));
     Demail.sendKeys("hirisat@gmail.com");
     Thread.sleep(1000);
     JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,250)");
		Thread.sleep(500);
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		jse4.executeScript("window.scrollBy(0,250)");
}
@Test(priority = 12)
public static void Discount() {
	
    WebElement Discount = driver.findElement(By.xpath("//*[@id=\"checkout-form\"]/section[3]/div/div/label"));
    Discount.click();
}
@Test(priority = 13)
public static void PaymentPage() throws InterruptedException {
	
	 
     WebElement BookButton = driver.findElement(By.xpath("//*[@id=\"book-button\"]"));
     Thread.sleep(500);
     Actions actions1 = new Actions(driver);
		actions1.moveToElement(BookButton).click().build().perform();
		Thread.sleep(5000);
}

@Test(priority = 14)
public static void PaymentDetails() throws InterruptedException {
	JavascriptExecutor jse5 = (JavascriptExecutor) driver;
	jse5.executeScript("window.scrollBy(0,250)");
	Thread.sleep(3000);
	WebElement CardNumber = driver.findElement(By.xpath(
			"/html/body/div[1]/div[3]/div[1]/div/article/div[1]/form[2]/section[1]/div[2]/div[4]/div[2]/div/input"));
	CardNumber.sendKeys("4263982640269299");
	WebElement ExpDate = driver.findElement(By.xpath(
			"/html/body/div[1]/div[3]/div[1]/div/article/div[1]/form[2]/section[1]/div[2]/div[4]/div[3]/div/div/div[1]/select"));
	ExpDate.sendKeys("02");
	WebElement CVV = driver.findElement(By.xpath(
			"/html/body/div[1]/div[3]/div[1]/div/article/div[1]/form[2]/section[1]/div[2]/div[4]/div[4]/div/input"));
	CVV.sendKeys("837");
	Thread.sleep(3000);
	JavascriptExecutor jse32 = (JavascriptExecutor) driver;
	jse32.executeScript("window.scrollBy(0,250)");
	JavascriptExecutor jse6 = (JavascriptExecutor) driver;
	jse6.executeScript("window.scrollBy(0,250)");
}

	@Test(priority = 15)
	public static void FinalBooking() throws InterruptedException {
	WebElement Book = driver.findElement(By.id("book-button"));
	Book.click();
	Thread.sleep(6000);
	
}

}
