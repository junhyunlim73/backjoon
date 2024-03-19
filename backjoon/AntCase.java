package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class AntCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] cave = new long[n];
        Queue<Long> queue = new LinkedList<Long>();
        long maxant = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            //cave[i] = Long.parseLong(st.nextToken());
            queue.add(Long.parseLong(st.nextToken()));
        }
        for(int i = 0; i < queue.size(); i++){
            long ant = 0;
            long q = queue.poll();
            long pre = q;
            boolean isIn = false;
            if(q == 0 || q == 1){
                ant += 1;
                isIn = true;
            }else{
                ant += q;
                isIn = false;
            }
            queue.add(q);
            for(int j = 1; j < n - 1; j++){
                long p = queue.poll();
                if(pre == 0 && pre == p){
                    if(!isIn){
                        ant += 1;
                        isIn = true;
                    }else{
                        isIn = false;
                    }
                    pre = p;
                }
                else{
                    if(p == 0){
                        ant += 1;
                        isIn = true;
                    }else{
                        ant += p;
                        isIn = false;
                    }
                    pre = p;
                }
                queue.add(p);
            }
            long p = queue.poll();
            if((pre != 0 || q != 0) && (p != 0 || q != 0)){
                if(p == 0){
                    ant += 1;
                }else{
                    ant += q;
                }
            }
            queue.add(p);
            queue.add(queue.poll());
            maxant = Math.max(ant, maxant);
        }

        System.out.println(maxant);
        br.close();
    }
}
