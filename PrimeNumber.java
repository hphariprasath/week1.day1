package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 8;
	    boolean flag = false;

	    for (int i = 1; i <= num/2; ++i) {
	      // condition for nonprime number
	    	System.out.println(i);
	      if (num % i == 0) {
	    	System.out.println(num%i);
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}


