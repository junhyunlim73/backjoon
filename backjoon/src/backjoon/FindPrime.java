package backjoon;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] nums = new int[num];
		int cnt = 0;
		for(int i = 0; i < num; i++) {
			nums[i] = in.nextInt();
		} 
		for(int n : nums) {
			boolean isPrime1 = true;
			if(n == 1)
				continue;
			else if(n == 2)
				cnt++;
			else {
				for(int i = 2; i < n; i++) {
					if(n % i == 0) {
						isPrime1 = false;
						break;
					}
						
				}
				if(isPrime1)
					cnt++;
			}
		}
		System.out.print(cnt);
	}
}
