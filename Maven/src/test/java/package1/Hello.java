package package1;
import org.testng.annotations.Test;

import src.Source;

public class Hello {
 
	@Test(priority=0)
	public void test() {
		// TODO Auto-generated method stub
		Source s = new Source(); 
		s.hello();
	}

}
