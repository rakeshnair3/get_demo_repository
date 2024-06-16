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
			
			System.out.println("1st update");
			System.out.println("2nd update");
			
			Thread.sleep(5000);
			wd.quit();
		}
		

	}


