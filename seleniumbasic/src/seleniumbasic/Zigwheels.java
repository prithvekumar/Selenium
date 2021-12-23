package seleniumbasic;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class Zigwheels {
	
    public static void main(String[] args) throws IOException, InterruptedException {  
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\selenium\\chromedriver.exe"); 
     WebDriver driver=new ChromeDriver();  
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     driver.navigate().to("https://www.zigwheels.com");  
     driver.manage().window().maximize();  
       
     JavascriptExecutor js = (JavascriptExecutor)driver;  
     
     
     WebElement p=driver.findElement(By.id("headerSearch"));
     p.sendKeys("Upcoming Bikes");
     WebDriverWait w = new WebDriverWait(driver, 5);
     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
     p.submit();
     
     driver.findElement(By.xpath("//a[@href='/upcoming-bikes']")).click();
     
     Select objSelect =new Select(driver.findElement(By.id("makeId")));
     objSelect.selectByVisibleText("Honda");
    
     js.executeScript("scrollBy(0, 1500)");

//    driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div[1]/div[2]/ul/li[20]/span")).click();
   
//   List<WebElement> allLinks = driver.findElements(By.cssSelector("div[id='carModels'] ul li"));
  List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='mk-row srp_main_div clr']/li[@data-price<400000]"));

  System.out.println("Details of Upcoming Honda bikes below 4Lakhs: ");
  System.out.println("------------------------------");
  for(int j=0;j<allLinks.size();j++) {
	  System.out.println( allLinks.get(j).getText());
	  System.out.println(" ");
  }
  
 }  

}  
	

