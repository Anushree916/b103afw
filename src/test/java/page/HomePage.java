package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;

public class HomePage {

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBTN;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyHomePageIsDisplayed(WebDriverWait wait,ExtentTest test)
	{
		try //we get timeoutexception if time is exceeded so write try catch block
		{
			wait.until(ExpectedConditions.visibilityOf(logoutBTN));//VERFY WHETHER LOGOUT BUTTON IS VISIBLE ARE NOT
			test.info("Homepage is displayed");
			return true;
		}
		catch (Exception e)
		{
			test.info(e.getMessage());
			test.info("Homepage is NOT displayed");
			return false;
		}
	}
	
}
