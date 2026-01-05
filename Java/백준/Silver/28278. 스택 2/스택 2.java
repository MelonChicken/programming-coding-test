import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if(line.contains("1")){
                Integer num = Integer.valueOf(line.split(" ")[1]);
                stack.push(num);
            } else if(line.startsWith("2")){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()+"\n");
                } else {
                    sb.append("-1\n");
                }
            } else if(line.startsWith("3")){
                sb.append(stack.size()+"\n");
            } else if(line.startsWith("4")){
                if(!stack.isEmpty()){
                    sb.append(0+"\n");
                } else {
                    sb.append("1\n");
                }
            } else if(line.startsWith("5")){
                if(!stack.isEmpty()){
                    sb.append(stack.peek()+"\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);

    }
}