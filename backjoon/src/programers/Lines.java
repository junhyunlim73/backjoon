package programers;

import java.util.Arrays;
import java.util.Comparator;

public class Lines {
    public static void main(String[] args) {
        int answer = 0;
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        Arrays.sort(lines, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] - o2[0] == 0)
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int[][] duline = new int[3][2];
        for(int i = 0; i < 2; i++){
            duline[i][0] = Math.max(lines[i][0], lines[i+1][0]);
            duline[i][1] = Math.min(lines[i][1], lines[i+1][1]);
        }
        duline[2][0] = Math.max(lines[0][0], lines[2][0]);
        duline[2][1] = Math.min(lines[0][1], lines[2][1]);

        for(int i = 0; i < 3; i++){
            System.out.println(duline[i][0] + " " + duline[i][1]);
        }

        int s = 0;
        int e = 0;
        boolean isDuple = true;
        for(int i = 0; i < 3; i++){
            if(duline[i][0] < duline[i][1]){
                if(s == 0){
                    s = duline[i][0];
                    e = Math.max(e, duline[i][1]);
                }
                else {
                    s = Math.min(s, duline[i][0]);
                    e = Math.max(e, duline[i][1]);
                }
                answer += duline[i][1] - duline[i][0];
            }else{
                isDuple = false;
            }
        }
        if(isDuple){
            answer = e - s;
        }
        System.out.println(answer);
    }
}
