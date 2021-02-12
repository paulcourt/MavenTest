package primes_pc;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumbersTest {

	@Test
	public void testAdd() {		
		PrimeNumbers instance = new PrimeNumbers();
		int expected = 5;
		int actual = instance.add(2,3);
		System.out.println("Test will run");
		assertEquals(actual, expected);
	}
	
	   @Test
	    public void testComputePrimes() {
	        System.out.println("A test of computePrimes method.");
	        int n = 5;
	        PrimeNumbers instance = new PrimeNumbers();
	        instance.computePrimes(n);
	        String result = instance.toString();
	        
	        System.out.println(result);
	        assertEquals("[2, 3, 5, 7, 11]", result);
	        
	    }

	     /**
	     * Test of that infects, but still outputs the correct answer.
	     */
	    @Test
	    public void testInfectNoReveal() {
	        System.out.println("A test of infectNoReveal.");
	        int n = 5;
	        PrimeNumbers instance = new PrimeNumbers();
	        instance.computePrimes(n);
	        String result = instance.toString();
	        
	        System.out.println(result);
	        assertEquals("[2, 3, 5, 7, 11]", result);
	        
	    }
	    
	    /**
	     * Test of that infects, and reveals an unexpected result.
	     */
	   
	    @Test
	    public void testInfectReveal() {
	        System.out.println("A test of infectReveal.");
	        int n = 8;
	        PrimeNumbers instance = new PrimeNumbers();
	        instance.computePrimes(n);
	        String result = instance.toString();
	        
	        System.out.println(result);
	        assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", result);
	        
	    }    
}
