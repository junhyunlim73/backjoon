package programers;

public class FiboNum {
    public static void main(String[] args){
        int n = 1500;
        int answer = 0;
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i < n + 1; i++){
            fibo[i] = (fibo[i-1] % 1234567 + fibo[i-2] % 1234567) % 1234567;
        }
        answer = fibo[n];
        System.out.println(answer);
        //1058440
    }
}
