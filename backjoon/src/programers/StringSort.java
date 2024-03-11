package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		String[] answer = new String[strings.length];
		ArrayList<String> list = new ArrayList<String>();
		
		for(String str : strings) {
			list.add(str);
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.charAt(n) < o2.charAt(n))
					return -1;
				else if(o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				}else
					return 1;
			}
		});
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
