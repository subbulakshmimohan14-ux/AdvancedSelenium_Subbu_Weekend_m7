package Com.DemoWebShop_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Com.WebShop_POM.Home_Page;
import Com.WebShop_POM.Login_Page;
import Com.WebShop_POM.WelcomePage;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public FileUtility fileutility = new FileUtility();
	public WelcomePage welcomepage;
	public Login_Page loginpage;
	public Home_Page homepage;
	public Webdriver_utility webdriverutility = new Webdriver_utility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite ---DataBase Connection open");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ---Report  Generation");
		spark = new ExtentSparkReporter(FrameWorkConstant.reportPath);
		reports = new ExtentReports();
		reports.attachReporter(spark);
		test = reports.createTest("DemoWebshop");

	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("Before Class ---Launch Browser");

		// String browser = fileutility.readDataFromPropertyFile("browsername");
		// String Url = fileutility.readDataFromPropertyFile("url");

		String browser = System.getProperty("browserName");
		String Url = System.getProperty("baseUrl");

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Running the test on chrome brower");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Running the test on edge brower");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Running the test on firefox brower");
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Please pass the correct browser :" + browser);
		}
		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);

	}

	@BeforeMethod

	public void beforemethod() throws IOException {
		System.out.println("Before method ---Login to App");
		welcomepage = new WelcomePage(driver);
		welcomepage.getLoginbtn().click();

		loginpage = new Login_Page(driver);
		loginpage.getEmailTextField().sendKeys(fileutility.readDataFromPropertyFile("username"));
		loginpage.getPassworTextField().sendKeys(fileutility.readDataFromPropertyFile("password"));
		loginpage.getLoginButton().click();
		homepage = new Home_Page(driver);

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ---Logout from App");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class ---close browser");
		driver.quit();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test ---Reports End");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite ---Database connection closed");
	}

}
