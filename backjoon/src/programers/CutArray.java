package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class CutArray {
    public static void main(String[] args){
        int n = 3;
        long left = 7;
        long right = 14;
        int[] answer = new int[(int) (right-left+1)];

        int index = 0;

        for(long i = left; i < right + 1; i++){
            int col = (int)(i / n);
            int row = (int)(i % n);
            if(col < row){
                answer[index++] = row + 1;
            }else {
                answer[index++] = col + 1;
            }
            System.out.print(answer[index-1] + " ");
        }
    }
}
