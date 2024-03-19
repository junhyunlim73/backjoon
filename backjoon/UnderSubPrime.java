package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UnderSubPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = a; i <= b; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int num = i;
            while(num != 1){
                int n = lcd(num);
                list.add(n);
                num /= n;
            }
            if(isPrime(list.size()))
                cnt++;
        }
        System.out.println(cnt);
        br.close();
    }

    private static int lcd(int num){
        for(int i = 2; i < (int) Math.sqrt(num) + 1; i++){
            if(num % i == 0)
                return i;
        }
        return num;
    }

    private static boolean isPrime(int num){
        if(num < 2)
            return false;
        else{
            for(int i = 2; i < (int) Math.sqrt(num) + 1; i++){
                if(num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
