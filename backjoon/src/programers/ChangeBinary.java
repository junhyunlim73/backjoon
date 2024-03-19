package programers;

public class ChangeBinary {
    public static void main(String[] args){
        String s = "1111111";
        int zero = 0;
        int cnt = 0;
        while(!s.equals("1")){
            String num = s.replace("0","");
            zero += s.length() - num.length();
            s = Integer.toBinaryString(num.length());
            cnt++;
        }
        System.out.println(cnt + " " +  zero);
    }
}
