package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.toUpperCase();
        int[] arr = new int[26];
        int index = 0;
        int max = 0;
        boolean isDuple = false;
        for(char c : word.toCharArray()){
            arr[c - 'A'] += 1;
        }

        for(int i = 0; i < 26; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
                isDuple = false;
            }else if(max == arr[i]){
                isDuple = true;
            }
        }

        if(isDuple){
            System.out.println("?");
        }else{
            System.out.println((char)('A'+index));
        }

        br.close();
    }
}
