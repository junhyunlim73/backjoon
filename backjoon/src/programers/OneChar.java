package programers;

import java.util.Arrays;

public class OneChar {
    public static void main(String[] args){
        String s = "abcabcadc";
        String[] temp = s.split("");
        Arrays.sort(temp);
        String answer = "";
        boolean isDuple = false;
        for(int i = 0; i < temp.length-1; i++){
            if(temp[i].equals(temp[i+1]))
                isDuple = true;
            else{
                if(isDuple)
                    isDuple = false;
                else
                    answer += temp[i];
            }
        }
        int n = (int)Math.sqrt(4);
        if(isDuple)
            isDuple = false;
        else
            answer += temp[temp.length-1];

        System.out.println(answer);
    }
}
