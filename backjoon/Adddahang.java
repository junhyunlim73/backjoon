package backjoon;

public class Adddahang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		String polynomial = "3x + 7 + x";
		String[] temp = polynomial.split(" ");
		int x = 0;
		int num = 0;
		for(String str : temp) {
			if(str.indexOf("x") != -1) {
				if(str.indexOf("x") == 0)
					x += 1;
				else {
					x += Integer.parseInt(str.replace("x","").strip());
				}
			}else if(!str.equals("+")) {
				num += Integer.parseInt(str);
			}
		}
		if(num == 0)
			answer = String.valueOf(x) + "x";
		else if(x == 0)
			answer = String.valueOf(num);
		else if(x == 1)
			answer = "x + " + String.valueOf(num);
		else
			answer = String.valueOf(x) + "x + " + String.valueOf(num);
		System.out.println(answer);
	}

}
