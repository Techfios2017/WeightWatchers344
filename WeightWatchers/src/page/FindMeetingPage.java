package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindMeetingPage {

WebDriver driver;
	
	public FindMeetingPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="meetingSearch")
	WebElement searchbox;

	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/ui-view/ui-view/div/div/div/div/div[2]/div[1]/div/form/div[1]/span/button")
	WebElement searchbutton;
    
	public void SearchZip(String zip)
    {	
    
    	searchbox.sendKeys(zip);
    	searchbutton.click();
    }


}
