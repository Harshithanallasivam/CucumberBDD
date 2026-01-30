package PacStepDef;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDef {
    WebDriver driver;
    private String[] InvokeBrowser() throws IOException {
    	String[] browser= new String[3];
    	String path1="C:/Users/harshitha.n8/eclipse-workspace/TestingMGMetaGeeksPUN_GM_CucumberBDD_SeleniumConfig1/TestData/data1.properties";
    	FileReader fr= new FileReader(path1);
    	Properties p = new Properties();
    	p.load(fr);
    	browser[0]= p.getProperty("Browser");
		browser[1]= p.getProperty("Browser1");
		browser[2]= p.getProperty("Browser2");
		return browser;
	}
    @Given("the user must be in chrome browser")
    public void setup() throws IOException {
    	String[] browser =InvokeBrowser();
    	for(int i=0;i<browser.length;i++) {
    	if(browser[i].equals("Chrome")) {
    		driver= new ChromeDriver();
    	}
    	else if(browser[i].equals("Edge")) {
    		driver = new EdgeDriver();
    	}
    	else if(browser[i].equals("FireFox")) {
    		driver= new FirefoxDriver();
    	}
    }
    }  
    @Given("The user in the signup page")
    public void signup_page() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        String baseURL = "https://www.bookswagon.com/login?q=signup";
        driver.get(baseURL);
    }
    @When("The user enters signup details from excel")
    public void enterSignupDetailsFromExcel() throws Exception {
        String filePath = "C:/Users/harshitha.n8/eclipse-workspace/TestingMGMetaGeeksPUN_GM_CucumberBDD_SeleniumConfig1/src/Name_Mobilenumber.xlsx";
        String sheetName = "Sheet1";
        int rowCount = ExcelUtil.getRowCount(filePath, sheetName);
        for (int i = 1; i <= rowCount; i++) { 
            String name = ExcelUtil.getCellData(filePath, sheetName, i, 0);
            String phone = ExcelUtil.getCellData(filePath, sheetName, i, 1);
            // Enter Name
            driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtName']")).clear();
            driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtName']")).sendKeys(name);
            // Enter Phone Number
            driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).clear();
            driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignUp_txtEmail']")).sendKeys(phone);
            Thread.sleep(2000);
        }
    }
    @And("The user click on i am not a robot")
    public void clickRobot() throws InterruptedException {
        System.out.println("Please complete CAPTCHA manually..."); 
        Thread.sleep(35000);
    }
    @And("The user click on continue")
    public void clickContinue() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(
                By.xpath("//input[@name='ctl00$phBody$SignUp$btnContinue']"))
                .click();
    }
    @Then("the user will enter in the website")
    public void enterWebsite() {
        System.out.println("Signup flow executed using Excel data");
    }
}