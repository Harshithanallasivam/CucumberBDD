package ExcelReadAccess;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ExcelRead_POI.ExcelRead_POI.ExcelRead;
  public class TR_Auomatiom {
  WebDriver driver =new ChromeDriver();
  ExcelRead obj = new ExcelRead();
  @Test
  public void SearchStringPass_Goggle() throws IOException {
	  driver.get("https://www.google.com");
	  String testdata = obj.ReadCellData(2,1);
	  driver.findElement(By.name("q")).sendKeys(testdata);
  }
}