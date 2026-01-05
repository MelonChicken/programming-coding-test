import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] brackets = br.readLine().split("");
            boolean flag = true;
            for(int j=0;j<brackets.length;j++){
                if(brackets[j].equals("(")){
                    stack.push(brackets[j]);
                } else if(brackets[j].equals(")") && !stack.isEmpty()){
                    String prior = stack.peek();
                    if(prior.equals("(")){
                        stack.pop();
                    } else {
                        flag = false;
                        break;
                    }
                } else if(brackets[j].equals(")") && stack.isEmpty()){
                    flag = false;
                    break;
                }
            }
            if(!stack.isEmpty()){
                flag = false;
            }
            if(flag){
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
            stack.clear();
        }
        System.out.println(sb);

    }
}