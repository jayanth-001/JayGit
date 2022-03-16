package Demo;

import org.testng.annotations.Test;

public class ReaddataTest {

	@Test
	public void read()
	{
		String BROSWER = System.getProperty("browser");
		System.out.println(BROSWER);
		System.out.println(" Firefox launched");
		
		String URL = System.getProperty("url");
		System.out.println(URL);
		System.out.println("https:Facebook.com");
		
		
	}
	
	
}
