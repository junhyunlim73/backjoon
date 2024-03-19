package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FiboNachiNum2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for(int i = 0; i < n; i++){
            int num = nums[i];
            ArrayList<Long> fivo = new ArrayList<Long>();
            fivo.add(0L);
            fivo.add(1L);
            int index = 2;
            while(true){
                fivo.add(fivo.get(index-1) + fivo.get(index-2));
                if(fivo.get(index) <= num) break;
                index++;
            }
            ArrayList<Long> list = new ArrayList<Long>();
            Collections.sort(list, Collections.reverseOrder());
            for(long nl : fivo){
                if(nl <= num){
                    list.add(nl);
                    num -= nl;
                }
            }
            Collections.sort(list);
            for(long nl : list){
                System.out.print(nl + " ");
            }
            System.out.println();
        }
    }
}

//1,000,000,000.
