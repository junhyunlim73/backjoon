package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SpecialSort {
    public static void main(String[] args){
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : numlist){
            list.add(num);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = Math.abs(o1 - n);
                int n2 = Math.abs(o2 - n);
                if(n1 == n2)
                    return o2 - o1;
                return n1 - n2;
            }
        });

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
