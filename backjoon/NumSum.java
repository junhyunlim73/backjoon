package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] temp = str.split("");
        for(String s : temp){
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
