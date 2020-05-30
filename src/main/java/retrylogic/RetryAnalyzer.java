// THIS CLASS IMPLEMENTS THE RETRY LOGIC AT TEST LEVEL

package retrylogic;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//IRetryAnalyzer is an interface in the package org.testng
public class RetryAnalyzer implements IRetryAnalyzer {
    
	
	int i=0,retrylimit=3;
      
    // Overriding the the retry() method of the IRetryAnalyzer interface, which is a mandatory part    
      
      public boolean retry(ITestResult result)
      {
    	  if(i<retrylimit)
    	  {
    		  i++;
    		  return true; 
    	  }
    	  
    	  
    	  return false; 
      }
      

}
