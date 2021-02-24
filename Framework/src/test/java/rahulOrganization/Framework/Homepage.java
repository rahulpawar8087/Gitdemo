package rahulOrganization.Framework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homepage extends Base
{
@Test(dataProvider="getdata")
public void home(String email,String password) throws IOException, InterruptedException
	{
		mallu=InitBrow();
		mallu.get("http://www.qaclickacademy.com/");
		Login l=new Login();
		Thread.sleep(11000);
		l.popup().click();
		l.login().click();
		l.email().sendKeys(email);
		l.password().sendKeys(password);
		l.gone().click();
	
	}
@DataProvider

	public Object[][] getdata()
	{
		Object data[][]=new Object[1][2];
		data[0][0]="abc";
		data[0][1]="pqr";
		//data[1][0]="xyz";
		//data[1][1]="how";
		return data;
	}



}
