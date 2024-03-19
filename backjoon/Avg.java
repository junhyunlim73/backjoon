package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Avg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] arr = new int[n];
        double avg = 0.0;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(arr);
        int m = arr[n-1];
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += (double) arr[i] / m * 100;
        }
        avg = sum / n;
        System.out.println(avg);
        br.close();
    }
}
