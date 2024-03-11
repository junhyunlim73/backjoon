package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str;
		while(true) {
			str = scan.nextLine();
			if(str.equals("0 0 0"))
				break;
			else { 
				String[] temp = str.split(" ");
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(String num : temp) {
					list.add(Integer.parseInt(num));
				}
				int max = Integer.parseInt(temp[0]) >  Integer.parseInt(temp[1]) ? Integer.parseInt(temp[0]) : Integer.parseInt(temp[1]);
				max = max > Integer.parseInt(temp[2]) ? max : Integer.parseInt(temp[2]);
				int sum = 0;
				int index = list.indexOf(max);
				list.remove(index);
				for(int i = 0; i < list.size(); i++) {
					sum += list.get(i);
				}
				if(max >= sum) {
					System.out.println("Invalid");
				}else if(max * 2 == sum) {
					System.out.println("Equilateral");
				}else {
					if(list.get(0) == list.get(1)) {
						System.out.println("Isosceles");
					}else {
						if(list.get(0) == max) {
							System.out.println("Isosceles");
						}else if(list.get(1) == max) {
							System.out.println("Isosceles");
						}else {
							System.out.println("Scalene");
						}
					}
				}
			}
		}
	}
}
