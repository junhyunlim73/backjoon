package backjoon;

import java.util.Scanner;

public class FindPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPrime2 main = new FindPrime2();
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		for(int i = num1; i < num2 + 1; i++) {
			if(main.isPrime(i))
				System.out.println(i);
		}
	}
	
	private boolean isPrime(int num) {
		if(num == 1)
			return false;
		else {
			int n = (int) Math.pow(num, 0.5);
			for(int i = 2; i < n+1; i++) {
				if(num % i == 0)
					return false;
			}
			return true;
		}
	}
}
