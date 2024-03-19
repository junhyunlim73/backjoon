package programers;

public class TwoBit {
    public static void main(String[] args){
        long[] numbers = {2, 7};
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            long n = numbers[i] + 1;
            while(true){
                int cnt = 0;
                long bit = numbers[i] ^ n;
                String str = Long.toBinaryString(bit);
                String str2 = str.replace("1","");
                cnt = str.length() - str2.length();
                if(cnt <= 2){
                    answer[i] = n;
                    break;
                }
                n++;
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}
