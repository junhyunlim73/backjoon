package backjoon;

import java.util.*;

public class ManyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		int[] numsCount = new int[1000];
		for(int num : array) {
			numsCount[num] += 1;
		}
		Arrays.sort(numsCount);

		if(numsCount[998] == numsCount[999]) {
			System.out.println(-1);
		}else {
			System.out.println(numsCount[999]);
		}
	}

}
