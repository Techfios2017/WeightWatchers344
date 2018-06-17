package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.FindMeetingPage;
import page.Homepage;
import page.LocationDetailspage;
import page.SearchResultpage;
import util.BrowserFactory;

public class MeetingSetupTest {

@Test
public void MeetingSetup() throws IOException{

//navigating to the URL	
WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");	

//maximizing the browser
driver.manage().window().maximize();

//verifying home page title		
assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers" , driver.getTitle());

Homepage home = PageFactory.initElements(driver, Homepage.class);

//Clicking FindMeeting		
home.GoToFindMeeting();

//Verifying  title of Find Meeting 
assertEquals("Find A Meeting: Get Schedules & Times Near You | Weight Watchers" , driver.getTitle());

FindMeetingPage search = PageFactory.initElements(driver, FindMeetingPage.class);

//Searching the required zipcode
search.SearchZip("10011");

SearchResultpage result=PageFactory.initElements(driver, SearchResultpage.class);

//printing the result of the zipcode
result.PrintZipResult();

//clicking of the first zipcode
result.ClickFirstZip();

LocationDetailspage clickresult=PageFactory.initElements(driver, LocationDetailspage.class);

//printing hours of operation
clickresult.PrintingtHoursOfOperation();

//Tear down
driver.close();

driver.quit();
			
	
}

}
