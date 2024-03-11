package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class NeighborBoard {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NeighborBoard nb = new NeighborBoard();
        String[][] board  = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"},
            {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
        int answer = 0;
        int row = board[0].length;
        int col = board.length;
        String color = board[h][w];

        if(nb.isChecked(h-1, w, row, col)){
            if(color.equals(board[h-1][w])){
                answer++;
            }
        }if(nb.isChecked(h, w-1, row, col)){
            if(color.equals(board[h][w-1])){
                answer++;
            }
        }if(nb.isChecked(h, w+1, row, col)){
            if(color.equals(board[h][w+1])){
                answer++;
            }
        }if(nb.isChecked(h+1, w, row, col)){
            if(color.equals(board[h+1][w])){
                answer++;
            }
        }
        System.out.println(answer);
    }

    private boolean isChecked(int i, int j, int row, int col){
        if(i < 0 || j < 0 || j >= row || i >= col)
            return false;
        else
            return true;
    }
}
