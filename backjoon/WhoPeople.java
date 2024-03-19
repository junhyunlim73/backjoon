package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WhoPeople {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < n; i++){
            map.put(br.readLine(), 1);
        }

        for(int i = 0; i < m; i++){
            String name = br.readLine();
            if (map.containsKey(name)) {
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(String name : list){
            System.out.println(name);
        }
        br.close();
    }
}
