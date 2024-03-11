package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int num : arr) {
			list.add(num);
		}
		Arrays.sort(arr);
		list.remove(list.indexOf(arr[0]));

		if(list.size() == 0){
			int[] answer = {-1};
			System.out.println(answer[0]);
		}else{
			int[] answer = new int[list.size()];
			for(int i = 0; i < list.size(); i++){
				answer[i] = list.get(i);
				System.out.println(answer[i]);
			}
		}

	}
}
