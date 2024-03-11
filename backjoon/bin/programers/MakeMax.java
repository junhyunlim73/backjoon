package backjoon.bin.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MakeMax {
    public static void main(String[] args){
        int[] numbers = {1, 2, -3, 4, -5};
        Arrays.sort(numbers);
        int max = numbers[0] * numbers[1];
        if(numbers.length > 2){
            max = Math.max(max, numbers[numbers.length-1] * numbers[numbers.length-2]);
        }
        System.out.println(max);
    }
}
