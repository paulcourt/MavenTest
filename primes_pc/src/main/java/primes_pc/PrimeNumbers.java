package primes_pc;

	import java.util.*;

	public class PrimeNumbers{
		
		public int add(int a, int b) {
			return a + b;
			
		}
	
	private List<Integer> primes = new ArrayList<Integer>();


	   public void computePrimes (int n)
	   {
	      int count = 1; // count of primes
	      int number = 2; // number tested for primeness
	      boolean isPrime; // is this number a prime

	      while (count <= n)
	      {
	         isPrime = true;
	         for (int divisor = 2; divisor <= number / 2; divisor++)
	         {
	             if (number % divisor == 0)
	            {
	               isPrime = false;

	               break; // for loop
	            }
	         }
	         if (isPrime) {
	            primes.add (number);

	            count++;
	         }
		      
	         number++;
	      }
	   }

	   public Iterator<Integer> iterator() 
	   { 
	      return primes.iterator(); 
	   }

	   @Override public String toString() 
	   { 
	      return primes.toString(); 
	   }

	   public static void main (String[] argv) 
	   {
	      PrimeNumbers primes = new PrimeNumbers();
	      primes.computePrimes(8);
	      System.out.println("Primes: " + primes);

	      Iterator<Integer> itr = primes.iterator();
	      System.out.println("First prime: " + itr.next());
	   }
	}
	
