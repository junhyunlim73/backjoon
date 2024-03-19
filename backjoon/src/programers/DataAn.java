package programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class DataAn {
    public static void main(String[] args){
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] answer = {};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<int[]> list =new ArrayList<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        for(int i = 0; i < data.length; i++){
            if(data[i][1] < val_ext)
                list.add(data[i]);
        }
        int index = map.get(sort_by);

        Collections.sort(list, new Comparator<int[]>() {
            @Override

            public int compare(int[] o1, int[] o2) {
                return o1[index] - o2[index];
            }
        });

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)[0] + " " + list.get(i)[1] + " " + list.get(i)[2] + " " + list.get(i)[3]);
        }

    }
}
