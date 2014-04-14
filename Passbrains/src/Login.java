import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{
	public static void main(String[] args) 
	{
		
		FirefoxDriver login = new FirefoxDriver(); 
	    
// Delete member if the member is exist with the same email address.
		
	    login.get("http://sandbox.passbrains.com/controllers/registerController.php?action=deleteMember&email=PB.automation@hotmail.com");
	    
// Disable captcha code
	    
	    login.get("http://sandbox.passbrains.com/controllers/captchaController.php?action=testavoid");
	    
		login.get("http://sandbox.passbrains.com");
		
	    login.manage().window().maximize();
	    
/*	    Test Register email address :- pb.automation@outlook.com
 		Password :- {Passbrains@123}
*/
	    
	    login.findElementByXPath(".//*[@id='registertype']").click();
	   
	    login.findElementByXPath(".//*[@id='expbut']/a/span").click();
	    
	    login.findElementByXPath(".//*[@id='first_name']").sendKeys("PB Platform");
	    
	    login.findElementByXPath(".//*[@id='last_name']").sendKeys("Automated Testing");
	    
	    login.findElementByXPath(".//*[@id='email']").sendKeys("pb.automation@outlook.com");
	    
	    login.findElementByXPath(".//*[@id='phone']").sendKeys("9886863191");
	    
	    login.findElementByXPath(".//*[@id='skype']").sendKeys("Abhinav.sejpal");
	    
	    login.findElementByXPath(".//*[@id='paypal']").sendKeys("bug.wrangler@outlook.com");
	    
        login.findElementByXPath(".//*[@id='country']").sendKeys("In");
	    
	  // there is some error here 
	    
	  // login.findElementByXPath(".//*[@id='cityc']").sendKeys("Bangalore");
	    
	    login.findElementByXPath(".//*[@id='zip']").sendKeys("363310");
	    
	    login.findElementByXPath(".//*[@id='street']").sendKeys("Virani Park");
	    
	    login.findElementByXPath(".//*[@id='gender1']").click();
	    
	    login.findElementByXPath(".//*[@id='year']").sendKeys("1990");
	    
	    login.findElementByXPath(".//*[@id='exp']").sendKeys("4.2 years");
	    
	    login.findElementByXPath(".//*[@id='hours']").sendKeys("1-5");
	    
	    login.findElementByXPath(".//*[@id='terms']").click();
	    
	    login.findElementByXPath(".//*[@id='register-merged']/div[4]/div/input[3]").click();
	    
//      login.quit();

	}
}
