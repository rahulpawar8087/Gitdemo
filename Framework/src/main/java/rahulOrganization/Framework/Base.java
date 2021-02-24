package rahulOrganization.Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver mallu;
public WebDriver InitBrow() throws IOException
	{
		Properties P=new Properties();
		FileInputStream FS=new FileInputStream("C:\\Users\\RAHUL\\eclipse-workspace\\Framework\\Data.properties");
		P.load(FS);
		String browserName=P.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		mallu=new ChromeDriver();
		return mallu;
	}
	
}
