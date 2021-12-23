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
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 
public class linkedin {
	public static void main(String[] args) throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.navigate().to("https://www.linkedin.com/");  
	     driver.manage().window().maximize(); 
	     JavascriptExecutor js = (JavascriptExecutor)driver; 
	     
//Login
	     WebElement u=driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
	     u.sendKeys("prithve01234@gmail.com");
	     WebElement p=driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
	     p.sendKeys("*********");
	     WebDriverWait w = new WebDriverWait(driver, 5);
	     driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button")).click();
	     
//viewprofile - whoviewedyourprofile
	     WebElement profile =  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]"));
	     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]")));
	     profile.click();
	     WebDriverWait w1 = new WebDriverWait(driver, 5);
	     w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Who viewed your profile')]")));
	     WebElement v1 =  driver.findElement(By.xpath("//span[contains(text(),'Who viewed your profile')]"));
	     v1 = driver.findElement(By.xpath("//span[contains(text(),'Who viewed your profile')]"));
	     v1.click();
	     WebElement vpdata =  driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/main/div/div[1]/div/h3/span"));
	     System.out.println("Number of People Who viewed your profile: "+vpdata.getText()+"");
	     System.out.println(" ");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"ember17\"]/img")).click();
	     
//viewprofile - searchapperaence
	     WebElement profile1 =  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]"));
	     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]")));
	     profile1.click();
	     WebDriverWait w3 = new WebDriverWait(driver, 5);
	     w3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Search appearances')]")));
	     WebElement sa1 =  driver.findElement(By.xpath("//span[contains(text(),'Search appearances')]"));
	     sa1.click();
	     WebElement sadata =  driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/main/header/div[2]/span[1]"));
	     System.out.println("Number of Search appearances: "+sadata.getText()+"");
	     System.out.println(" ");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"ember17\"]/img")).click();
	 
//viewprofile - Experiance
	     w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]")));
	     WebElement profile2 =  driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[2]"));
	     profile2.click();
	     List<WebElement> expdata =  driver.findElements(By.xpath("/html[1]/body[1]/div[8]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[7]/div[2]/span[1]/div[1]/section[1]/div[1]/section[1]/ul[1]"));
	     System.out.println("Experiance Details: ");
	     System.out.println("");
	     for(int j=0;j<expdata.size();j++) {
	   	  System.out.println( expdata.get(j).getText());
	   	  System.out.println(" ");
	     }
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"ember17\"]/img")).click();
	     
//logout
	    driver.findElement(By.xpath("//*[@id=\"ember36\"]")).click();
	    w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ember39\"]")));
	    driver.findElement(By.xpath("//*[@href=\"/m/logout/\"]")).click();
	  
	}
}
