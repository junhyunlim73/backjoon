package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Skating {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] v = new long[n];
        long sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = n - 1; i >= 0; i--){
            if(i == n - 1){
                if(v[i] > 0)
                    v[i] = 1;
            }else{
                if(v[i+1] < v[i])
                    v[i] = v[i+1] + 1;
                else if(v[i+1] == v[i])
                    v[i] = v[i+1];
            }
            sum += v[i];
        }

        System.out.println(sum);
        br.close();
    }
}
