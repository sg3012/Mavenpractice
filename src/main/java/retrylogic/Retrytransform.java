package retrylogic;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
// IAnnotation Transformer is an interface in TestNG framework. 
public class Retrytransform implements IAnnotationTransformer{

	// Overriding the transform() method of IAnnotationTransformer, which is mandatory 
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		
		// passing the class name of the RetryAnalyzer class that has logic for the RetryAnalyzer. 
       annotation.setRetryAnalyzer(RetryAnalyzer.class);
       
	  
	}
	
			
	}

