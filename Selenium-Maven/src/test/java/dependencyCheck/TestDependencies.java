package dependencyCheck;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDependencies 
{
	@Test
	public void browserTest()
	{
		new ChromeDriver();
		WorkbookFactory.create(null);	
	}

}
