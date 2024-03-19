package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < n; i++){
            boolean[] isAlpha = new boolean[26];
            boolean isduple = false;
            String str = br.readLine();
            for(int j = 1; j < str.length(); j++){
                char prech = str.charAt(j-1);
                char ch = str.charAt(j);
                if(prech != ch){
                    if(!isAlpha[prech - 'a']){
                        isAlpha[prech - 'a'] = true;
                        if(isAlpha[ch - 'a']){
                            isduple = true;
                            break;
                        }
                    }
                    prech = ch;
                }
            }if(!isduple){
                cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}

//4
//aba
//        abab
//abcabc
//        a
