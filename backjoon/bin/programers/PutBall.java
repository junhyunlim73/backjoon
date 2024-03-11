package backjoon.bin.programers;

import java.util.LinkedList;
import java.util.Queue;

public class PutBall {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};
        int k = 3;
        Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers){
            queue.add(num);
        }
        for(int i = 0; i < k-1; i++){
            queue.add(queue.peek());
            queue.remove(queue.peek());
            queue.add(queue.peek());
            queue.remove(queue.peek());
        }

    }
}
