package testng;

import org.testng.annotations.Test;

public class AnnotationExample2 extends BaseClass {
  
	@Test (groups= {"sanity"})
	public void test3() {
		
		System.out.println("Inside test3");
	}	
	public void test4() {
		
		System.out.println("inside test4");
	}
	
}
