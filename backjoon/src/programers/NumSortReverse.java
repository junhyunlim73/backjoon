package programers;

import java.util.Arrays;

public class NumSortReverse {
    public static void main(String[] args){
        long n = 118372;
        long answer = 0;
        char[] nums = String.valueOf(n).toCharArray();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            answer += (long)((nums[i] - 48) * Math.pow(10, i));
        }

        System.out.println(answer);
    }
}
