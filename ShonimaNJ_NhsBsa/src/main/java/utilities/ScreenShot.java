package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
		
		public void captureScreenshot(WebDriver driver ) throws IOException
		{
			TakesScreenshot scrShot =(TakesScreenshot)driver;
			File screenShot = scrShot.getScreenshotAs(OutputType.FILE);
			
			File f1=new File(System.getProperty("user.dir")+"\\OutPutScreenShot");
			  if (!f1.exists()){
				    f1.mkdirs();
				}
			  String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

			
			
			File fileDestination = new File(System.getProperty("user.dir")+"\\OutPutScreenShot\\"+timeStamp+".png");
			FileHandler.copy(screenShot, fileDestination);

}
	}
