package StepDef_Cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Document_StepDefTest1 {

	WebDriver driver;
	
	@Given("the user must be in chrome browser")
	public void presetup() {
	    driver = new ChromeDriver();
		
	}
	@Given("The user is in cucumberio home page")
	public void The_user_is_in_cucumberio_home_page() {
		driver.manage().window().maximize();
		String BaseURL = "https://cucumber.io/";
		driver.get(BaseURL);
		
	}
    @When("The user clicks on Documentation link")
    public void The_user_clicks_on_Documentation_link() {
    	WebElement DocLink= driver.findElement(By.xpath("//a[contains(text(),'Documentation')][1]"));
    	DocLink.click();
    	
    }
    @Then("The user can view the page content with what is cucumber?")
    public void The_user_can_view_the_page_content_with_what_is_cucumber() throws InterruptedException {
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    	//Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	WebElement DataStr = driver.findElement(By.xpath("//*[@id='what-is-cucumber']"));
    	String Data_Exp = DataStr.getText();
    	System.out.println(Data_Exp);
    	
    }

}
