import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int[] balances = new int[2];
        boolean flag;

        while(true){
            String str = br.readLine();
            if(str.equals(".")) break;

            String[] line = str.split("");
            flag = true;
            stack.clear();

            for(int i = 0; i < line.length; i++){
                String s = line[i];

                if(s.equals(".")) break;
                if(s.equals("(")){
                    stack.push(s);
                }
                if(s.equals(")")){
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    if(stack.peek().equals("(")){
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(s.equals("[")){
                    stack.push(s);
                }
                if(s.equals("]")){
                    if(stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    if(stack.peek().equals("[")){
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()){
                flag = false;
            }

            if(flag){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}