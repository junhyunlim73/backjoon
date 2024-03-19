package programers;

import java.util.ArrayList;
import java.util.Arrays;

public class FindKim {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] seoul ={"Jane", "Kim"};
        String answer = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));
        answer = "김서방은 " + list.indexOf("Kim") +"에 있다";
        System.out.println(answer);
    }
}
