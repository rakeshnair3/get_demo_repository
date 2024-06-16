package DemoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestJenkins_Test {

	
		@Test
		
		public void openBrwsr() throws Exception
		{
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			
			Thread.sleep(5000);
			wd.quit();
		}
		

	}


