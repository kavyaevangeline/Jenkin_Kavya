package Assert_1;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertSoft {

	
	@Test(groups = "smoke")
	public void m1() {
		
		SoftAssert sa=new SoftAssert();
		System.out.println(" - 1 -");
		System.out.println(" - 2 -");
		sa.assertEquals("a", "a");
		System.out.println(" - 3 -");
		System.out.println(" - 4 -");
		sa.assertAll();
	}
}
