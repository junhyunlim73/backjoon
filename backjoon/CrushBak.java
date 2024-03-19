package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CrushBak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ball = Integer.parseInt(st.nextToken());
        int basket = Integer.parseInt(st.nextToken());
        int[] baskets = new int[basket];
        int sum = (basket * (basket+1))/2;
        if(sum <= ball){
            for(int i = 0; i < basket; i++){
                baskets[i] = i+1;
                ball -= i+1;
            }
            while (ball != 0){
                if(ball <= basket){
                    int n = ball;
                    for(int i = 0; i < n; i++){
                        baskets[basket - n + i] += 1;
                        ball--;
                    }
                }else{
                    for(int i = 0; i < basket; i++){
                        baskets[i] += 1;
                        ball--;
                    }
                }
            }
            System.out.println(baskets[basket-1] - baskets[0]);
        }else{
            System.out.println("-1");
        }
        br.close();
    }
}

//public static int checkSum(int n, int ball){
//    for(int i = 1; i <= n; i++){
//        int sum = 0;
//        for(int j = 1; j <= i; j++){
//            sum += j;
//        }
//        if(sum == ball)
//            return i;
//    }
//    return -1;
//}

//    int index = checkSum(basket-1, ball);
//                if(index != -1){
//        for(int i = 0; i < index; i++){
//            baskets[basket - index + i] += i + 1;
//        }
//        System.out.println(baskets[basket-1] - baskets[0]);
//    }else{
//        System.out.println("-1");
//    }
