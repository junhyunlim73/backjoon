package backjoon;

import java.io.*;
import java.util.*;

public class Setest {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            String str = in.next();
            if(str.equals("all")) {
                set.clear();
                for(int j = 0; j < 20; j++) {
                    set.add(j+1);
                }
            } else if(str.equals("empty")) {
                set.clear();
            } else {
                int num = in.nextInt();
                if(str.equals("add")) {
                    set.add(num);
                } else if(str.equals("remove")) {
                    set.remove(num);
                } else if(str.equals("toggle")) {
                    if(set.contains(num))
                        set.remove(num);
                    else
                        set.add(num);
                } else if(str.equals("check")) {
                    if(set.contains(num))
                        System.out.println("1");
                    else
                        System.out.println("0");
                }
            }
        }
    }
}

