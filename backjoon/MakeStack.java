package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MakeStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String cmd = br.readLine();
            String[] temp = cmd.split(" ");
            if(temp[0].equals("push")){
                stack.push(Integer.parseInt(temp[1]));
            }if(temp[0].equals("pop")){
                if(!stack.empty()){
                    System.out.println(stack.pop());
                }else{
                    System.out.println("-1");
                }
            }if(temp[0].equals("size")){
                System.out.println(stack.size());
            }if(temp[0].equals("empty")){
                if(stack.empty())
                    System.out.println("1");
                else
                    System.out.println("0");
            }if(temp[0].equals("top")){
                if(!stack.empty()){
                    int top = stack.pop();
                    System.out.println(top);
                    stack.push(top);
                }else{
                    System.out.println("-1");
                }
            }
        }
        br.close();
    }
}
