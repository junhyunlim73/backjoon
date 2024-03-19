package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Thanos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String one = n.replace("0","");
        String zero = n.replace("1","");
        int zeroCnt = zero.length() / 2;
        int oneCnt = one.length() / 2;
        System.out.println(zeroCnt + " " + oneCnt);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < n.length(); i++){
            if(count == oneCnt)
                break;
            if(n.charAt(i) == '1'){
                list.add(i);
                count++;
            }
        }
        count = 0;
        for(int i = 0; i < n.length(); i++){
            if(count == zeroCnt)
                break;
            if(n.charAt(i) == '0'){
                list.add(i);
                count++;
            }
        }
        Collections.sort(list);
        for(int num : list){
            System.out.println(num);
        }
        String temp = "";
        int index = 0;
        for(int i = 0; i < n.length(); i++){
            if(index == list.size()){
                temp += n.charAt(i);
                continue;
            }
            int now = list.get(index);
            if(now == i){
                index++;
                continue;
            }
            temp += n.charAt(i);
        }
        System.out.println(temp);
        br.close();
    }
}
