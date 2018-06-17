package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocationDetailspage {

WebDriver driver;
	
	public LocationDetailspage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.XPATH,using=".//*[@id='ml-1180510']/result-location/div")
	WebElement resultlist2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div/div[1]/div/span")
	WebElement clickresultlist2;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[2]/div[2]/div[1]")
	WebElement hoursofoperation;

	
	 public void VerifyClickingFirstZip()
	    {
	    	String beforeclick=resultlist2.getText();
	    	String afterclick=clickresultlist2.getText();
	    	
	         if (beforeclick==afterclick)
	         {
	        	 System.out.println("First Result was properly clicked");
	         }
	         else
	         {
	        	 System.out.println("First result and clicked result differ");
	         }       
	    }

      public void PrintingtHoursOfOperation()
      {
    	System.out.println(hoursofoperation.getText());  
    	  
      }

}
