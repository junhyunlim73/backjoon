package programers;

import java.util.Arrays;

public class MakeMin {
    public static void main(String[] args){
        int[] a = {1, 2};
        int[] b = {3, 4};
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[a.length-1-i];
        }
        System.out.println(answer);
    }
}
