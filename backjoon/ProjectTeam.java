package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProjectTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2*n];
        int[][] team = new int[n][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 2 * n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            team[i][0] = arr[i];
            team[i][1] = arr[2*n-i-1];
        }
        int min = team[0][0] + team[0][1];
        for(int i = 1; i < n; i++){
            min = Math.min(min, team[i][0] + team[i][1]);
        }
        System.out.println(min);
    }
}
