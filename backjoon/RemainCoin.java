package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemainCoin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int remain = 1000 - money;
        int coin = 0;

        if(remain >= 500){
            coin += remain / 500;
            remain = remain % 500;
        }
        if(remain >= 100){
            coin += remain / 100;
            remain = remain % 100;
        }
        if(remain >= 50){
            coin += remain / 50;
            remain = remain % 50;
        }
        if(remain >= 10){
            coin += remain / 10;
            remain = remain % 10;
        }
        if(remain >= 5){
            coin += remain / 5;
            remain = remain % 5;
        }
        if(remain >= 1){
            coin += remain / 1;
        }
        System.out.println(coin);
        br.close();
    }
}
