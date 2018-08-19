package utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

/*
 * Report generation using Extent report
 * 
 * 
 */
public class ExtentManager {

	/*
	 * import the ExtentReport class
	 */
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(){
		
		if(extent==null){
			
			extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
			
			/*
			 * 
			 *  to define some property that you need to see in the extentreport we need a configuration file
			 *  configuration file can be found under src/test/resources/extentconfig/ReportsConfig
			 */
			
			extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\extentconfig\\ReportsConfig.xml"));
			
		}
		
		return extent;
	}
	
	
}
