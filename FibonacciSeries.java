package week1.day1;


public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int range = 7;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 1; i < range; i++) {
			int sum = 0;
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);
			
		}
		
		
		
		
	}

}
