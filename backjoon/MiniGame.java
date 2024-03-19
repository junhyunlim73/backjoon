package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MiniGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String game = st.nextToken();
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Y", 1);
        map.put("F", 2);
        map.put("O", 3);
        int cnt = map.get(game);
        int players = 0;
        int playCnt = 0;

        for(int i = 0; i < n; i++){
            String name = br.readLine();
            if(!names.containsKey(name)){
                names.put(name, 1);
                players++;
                if(cnt == players){
                    playCnt++;
                    players = 0;
                }
            }
        }
        System.out.println(playCnt);
        br.close();
    }
}
