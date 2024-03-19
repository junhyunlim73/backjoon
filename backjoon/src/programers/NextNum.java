package programers;

public class NextNum {
    public static void main(String[] args){
        int answer = 0;
        int n = 15;
        int cnt = countOne(n);

        while(true){
            n++;
            int cnt2 = countOne(n);
            if(cnt == cnt2) {
                answer = n;
                break;
            }
        }

        System.out.println(Integer.bitCount(answer));
    }

    private static int countOne(int n){
        String num = Integer.toBinaryString(n);
        int cnt = num.length() - num.replace("1","").length();
        return cnt;
    }
}


//if(cnt == 1){
//String num = Integer.toBinaryString(n);
//int pos = num.indexOf("1");
//num = "1" + num.substring(0, pos) + "0" + num.substring(pos + 1);
//answer = Integer.parseInt(num, 2);
//        }else{
//String num = Integer.toBinaryString(n);
//int pos2 = 3;
//            if(num.charAt(pos2 - 1) == '0'){
//        System.out.println(num);
//num = num.substring(0, pos2 - 1) + "10" + num.substring(pos2 + 1);
//                System.out.println(num);
//            }
//                    else{
//num = num.substring(0, pos2) + "01" + num.substring(pos2 + 1);
//            }
//answer = Integer.parseInt(num, 2);
//        }