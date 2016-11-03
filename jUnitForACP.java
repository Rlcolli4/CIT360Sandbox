import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
/*
 * To learn more about the jUnit Framework, visit the following site! 
 * http://junit.org/junit4/
 */
public class jUnitForACP {
/*
 * The @test dicealrs that we are running a test. the Timeout in parenthesis next to it indicates that 
 * if it takes longer than the specified time to run it will count as a failure for the tests.
 * You only have to declare it once for ALL tests, however you can override it by changing the time
 * on another test. Add this code "(timeout=1)" to testB's @ comment and see what happens.
 */
	@Test(timeout=5000) 
	public void testA() {
		calculatorForjunit testOne = new calculatorForjunit();
		double sum = testOne.evaluate("1+2+3+4+5");
	    assertEquals(15, sum);
		
		double dif = testOne.evaluate("15-5-4-3-2-1");
		assertEquals(0, dif);
		
	}
	
	@Test
	public void testB() /*throws InterruptedException*/ {
		/*
		 * this line of code can also cause a test to sleep for so long, this will actually cause BOTH 
		 * tests to fail as well because it will exceed five seconds.
		 * TimeUnit.SECONDS.sleep(6);You will need to uncomment out the throws above for it to work however.
		 */
		calculatorForjunit testOne = new calculatorForjunit();
		double sum = testOne.evaluate("1+2+3+4+5");
	    assertEquals(10, sum);
		
		double dif = testOne.evaluate("15-5-4-3-2-1");
		assertEquals(10, dif);
		
	}
	
	/*
	 *Now you can also add @Ignore to the code if you want it ignore a failure!
	 */
	@Ignore("Purposely Failed Test so we ignore it.")
	@Test
	public void testC() throws InterruptedException {
		TimeUnit.SECONDS.sleep(6);
		calculatorForjunit testOne = new calculatorForjunit();
		double sum = testOne.evaluate("1+2+3+4+5");
	    assertEquals(10, sum);
		
		double dif = testOne.evaluate("15-5-4-3-2-1");
		assertEquals(10, dif);
		
	}
}
