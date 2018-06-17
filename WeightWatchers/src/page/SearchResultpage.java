package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultpage {

WebDriver driver;
	
	public SearchResultpage(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.XPATH,using=".//*[@id='ml-1180510']/result-location/div")
	WebElement resultlist;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div/div[1]/div/span")
	WebElement clickresultlist;


     public void PrintZipResult()
     {
   
    	System.out.println(resultlist.getText());
    	 
     }     

	public void ClickFirstZip() 
	{
		resultlist.click();
		
	}

}
