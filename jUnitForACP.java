import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
/*
 * To learn more about the jUnit Framework, visit the following site! 
 * http://junit.org/junit4/
 */
public class jUnitForACP {
		/*Use assertFalse and Assert true to test if a condition is true or false*/
	@Test
	public void testD() {
		boolean testVariable = false;
		//The following details the error message that will display if the assert fails.
		String message = "The test should be false.";
		
		assertFalse(message, testVariable); //This should pass.
		/*
		assertTrue(message, testVariable); //This should fail as the value isn't true it is false.
		*/
	}
	@Test
	public void testE() {
		toThePower testExp = new toThePower();
		
		multiplyIt testMult = new multiplyIt();
		//This message is used for the error message assert can throw if it fails.
		String message = "The two objects are the same.";
		/*
		assertSame(message, testDivide, testMult); //This should fail because testDivide and testMult are not the same.
		*/
		assertNotSame(message, testExp, testMult); //This should pass.
	}
	@Test
	public void testF() {
		modulizeIt testMod = new modulizeIt();
		
		//This message is used for the error message assert can throw if it fails.
		String message = "This should NOT be a null value.";
		/*
		assertNull(message, testMod); //This should fail because testMod contains information and does not return a null value.
		*/
		assertNotNull(message, testMod); //This should pass because testMod is not a Null value.
	}
	@Test
	public void testG() {
		char[] arrayOne = new char[5];
		arrayOne[0] = '+';
		arrayOne[1] = '-';
		arrayOne[2] = '%';
		arrayOne[3] = '/';
		arrayOne[4] = '^';
		char[] arrayTwo = new char[5];
		arrayTwo[0] = '+';
		arrayTwo[1] = '-';
		arrayTwo[2] = '%';
		arrayTwo[3] = '/';
		arrayTwo[4] = '^';
		int[] arrayThree = new int[5];
		arrayThree[0] = 1;
		arrayThree[1] = 2;
		arrayThree[2] = 3;
		arrayThree[3] = 4;
		arrayThree[4] = 5;
		assertArrayEquals(arrayOne, arrayTwo); //This will pass because the two arrays are equal.
		/*
		 *    assertArrayEquals(arrayOne, arrayThree); //This will fail because the two arrays are different.
		 * 
		 */
	}
/*
 * The @test declares that we are running a test. the Timeout in parenthesis next to it indicates that 
 * if it takes longer than the specified time to run it will count as a failure for the tests.
 * You only have to declare it once for ALL tests, however you can override it by changing the time
 * on another test. Add this code "(timeout=1)" to testB's @ comment and see what happens.
 */
	@Test//(timeout=5000) 
	public void testA() {
		calculatorForjunit testOne = new calculatorForjunit();
		double sum = testOne.evaluate("1+2+3+4+5");
	    assertEquals(15, sum);
		
		double dif = testOne.evaluate("15-5-4-3-2-1");
		assertEquals(0, dif);
		
	}

	@Test
	public void testB() {//throws InterruptedException 
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
	
	 //*Now you can also add @Ignore to the code if you want it ignore a failure!
	
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
