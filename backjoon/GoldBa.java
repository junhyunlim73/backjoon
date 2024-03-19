package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            int[] arr = new int[2];
            int min = Integer.MAX_VALUE;
            for(int j = 2; j <= num / 2; j++){
                int num2 = num - j;
                if(isPrime(j) && isPrime(num2)){
                    if((num2 - j) < min){
                        arr[0] = j;
                        arr[1] = num2;
                        min = num2 - j;
                    }
                }
            }
            System.out.println(arr[0] + " " + arr[1]);
        }
    }

    private static boolean isPrime(int num){
        if(num < 2)
            return false;
        else{
            for(int i = 2; i < (int)Math.sqrt(num) + 1; i++){
                if(num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
