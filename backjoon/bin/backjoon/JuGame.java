package backjoon.bin.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class JuGame {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = in.nextInt();
        int player = 1;
        int[] board = new int[n];
        int[] ju = new int[n2];

        for(int i = 0; i < n; i++){
            board[i] = in.nextInt();
        }
        for(int i = 0; i < n2; i++){
            ju[i] = in.nextInt();
        }

        for(int i = 0; i < n2; i++){
            player += ju[i];
            if(player >= n){
                System.out.println(i+1);
                break;
            }else{
                player += board[player-1];
                player = Math.max(0, player);
            }
        }
    }
}
