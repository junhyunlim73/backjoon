package programers;

import java.util.Arrays;
import java.util.Comparator;

public class MaxMin {
    public static void main(String[] args){
        String s = "-4 -2 -3 -10";
        String[] temp = s.split(" ");
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = Integer.parseInt(o1);
                int n2 = Integer.parseInt(o2);
                return n1 - n2;
            }
        });
        String answer = temp[0] + " " + temp[temp.length-1];
        System.out.println(answer);
    }
}
