package backjoon;

import java.util.Arrays;

public class StrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		String str = "Zbcdefg";
		char[] c = str.toCharArray();
		Arrays.sort(c);
		answer = new StringBuilder(new String(c)).reverse().toString();
		System.out.println(answer);
	}

}
