package programers;

public class Fight {
    public static void main(String[] args){
        int n = 8;
        int a = 4;
        int b = 7;
        int answer = 1;

        while(n != 1){
            int num1 = a % 2 == 1 ? (a / 2) + 1 : a / 2;
            int num2 = b % 2 == 1 ? (b / 2) + 1 : b / 2;
            if(num1 == num2)
                break;
            else {
                a = a % 2 == 1 ? (a / 2) + 1 : a / 2;
                b = b % 2 == 1 ? (b / 2) + 1 : b / 2;
                n = n / 2;
                answer++;
            }
            System.out.println(a + " " + b);
        }

        System.out.println(answer);
    }
}
