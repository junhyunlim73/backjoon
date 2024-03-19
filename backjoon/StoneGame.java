package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoneGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(n != 0){
            if(n < 3)
                n -= 1;
            else
                n -= 3;
            cnt++;
        }

        if(cnt % 2 == 1)
            System.out.println("SK");
        else
            System.out.println("CY");

        br.close();
    }
}
