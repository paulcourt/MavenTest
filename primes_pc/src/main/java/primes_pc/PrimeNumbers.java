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
		int status = 1;
	      boolean isPrime; // is this number a prime

	      /*while (count <= n)
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
	   }*/
		   
	for ( int i = 2 ; i <=n ;  )
      		{
         for ( int j = 2 ; j <= Math.sqrt(number) ; j++ )
         {
            if ( number%j == 0 )
            {
               status = 0;
               break;
            }
         }
         if ( status != 0 )
         {
            primes.add (number);
            i++;
         }
         status = 1;
         num++;
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
	
