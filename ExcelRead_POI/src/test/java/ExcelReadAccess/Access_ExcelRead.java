package ExcelReadAccess;
 
import java.io.IOException;
 
import org.testng.annotations.Test;

import ExcelRead_POI.ExcelRead_POI.ExcelRead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Access_ExcelRead {
	WebDriver d=new ChromeDriver();
	ExcelRead obj= new ExcelRead();
  @Test
  public void f() throws IOException {
	  d.get("https://www.google.com");
	  String res=obj.ReadCellData(2,2);
	  System.out.println(res);
	  d.findElement(By.name("q")).sendKeys(res);
	  
	  
	  
  }
}
 