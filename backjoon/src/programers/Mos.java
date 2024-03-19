package programers;

import java.util.HashMap;

public class Mos {
    public static void main(String[] args){
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Character> map = new HashMap<String, Character>();

        for(int i = 0; i < 26; i++){
            map.put(mos[i], (char) ('a'+i));
        }

    }
}
