package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Olympic {
    public static void main(String[] args) throws IOException {
        int rank = 0;
        int cnt = 0;
        boolean isSame = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[Integer.parseInt(st.nextToken())][5];
        int n = Integer.parseInt(st.nextToken());
        for(int i = 0; i < arr.length; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr[i].length - 1; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
            arr[i][4] = i;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1] - o1[1] == 0){
                    if(o2[2] - o1[2] == 0){
                        if(o2[3] - o1[3] == 0){
                            return o1[0] - o2[0];
                        }
                        return o2[3] - o1[3];
                    }
                    return o2[2] - o1[2];
                }
                return o2[1] - o1[1];
            }
        });
        arr[0][4] = 0;
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length - 1; j++){
                if(arr[i][j] != arr[i-1][j]){
                    isSame = false;
                    break;
                }else{
                    isSame = true;
                }
            }
            if(isSame){
                cnt++;
                arr[i][4] = i - cnt;
            }else{
                cnt = 0;
                arr[i][4] = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length ; j++){
                 System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i][0] == n){
                rank = arr[i][4] + 1;
                break;
            }
        }
        System.out.println(rank);
        br.close();
    }
}

//for(int i = 0; i < arr.length; i++){
//        for(int j = 0; j < arr[i].length ; j++){
//        System.out.print(arr[i][j] + " ");
//            }
//                    System.out.println();
//        }