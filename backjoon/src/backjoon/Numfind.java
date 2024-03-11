package backjoon;

import java.util.Scanner;

public class Numfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < num; i++) {
			nums[i] = in.nextInt();
		}
		
		int max = nums[0];
		int min = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		
		System.out.println(max * min);
	}

}
