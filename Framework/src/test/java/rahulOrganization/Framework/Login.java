package rahulOrganization.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base
{
	By sign=By.cssSelector("#homepage > header > div.tools > div > nav > ul > li:nth-child(4) > a > span");
	By Email=By.cssSelector("#user_email");
	By Pass=By.cssSelector("#user_password");
	By go=By.cssSelector("#hero > div > form > div.form-group.text-center > input");
	By pop=By.cssSelector("#homepage > div.sumo-form-wrapper.listbuilder-popup > div.listbuilder-popup-content > div > div > div > span > div > div:nth-child(7) > div > div > button");
	public WebElement login()
	{
		return mallu.findElement(sign);
	}
	public WebElement email()
	{
		return mallu.findElement(Email);
	}
	public WebElement password()
	{
		return mallu.findElement(Pass);
	}
	public WebElement gone()
	{
		return mallu.findElement(go);
	}
	public WebElement popup()
	{
		return mallu.findElement(pop);
	}



}
