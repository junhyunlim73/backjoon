package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cookie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] board = new String[n][n];
        int rHeart, cHeart;
        boolean isFind = false;
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split("");
            for(int j = 0; j < n; j++){
                board[i][j] = temp[j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j].equals("*")){
                    isFind = true;
                    rHeart = i + 1;
                    cHeart = j;
                    System.out.println((rHeart+1) + " " + (cHeart + 1));
                    int leftArm = 0;
                    int rightArm = 0;
                    int body = 0;
                    int leftleg = 0;
                    int rightleg = 0;
                    for(int k = cHeart -1 ; k >= 0; k--){
                        if(board[rHeart][k].equals("*"))
                            leftArm++;
                        else
                            break;
                    }for(int k = cHeart + 1; k < n; k++){
                        if(board[rHeart][k].equals("*"))
                            rightArm++;
                        else
                            break;
                    }for(int k = rHeart + 1; k < n; k++){
                        if(board[k][cHeart].equals("*"))
                            body++;
                        else
                            break;
                    }for(int k = rHeart + body + 1; k < n; k++){
                        if(board[k][cHeart-1].equals("*"))
                            leftleg++;
                        else
                            break;
                    }for(int k = rHeart + body+1; k < n; k++){
                        if(board[k][cHeart+1].equals("*"))
                            rightleg++;
                        else
                            break;
                    }
                    System.out.println(leftArm + " " + rightArm + " " + body + " " + leftleg + " " + rightleg);
                    break;
                }
            }
            if(isFind){
                break;
            }
        }
        br.close();
    }
}
