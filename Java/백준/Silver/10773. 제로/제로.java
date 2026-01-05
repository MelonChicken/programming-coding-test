import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int total = 0;

        for(int i = 0; i < k; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                total -= stack.pop();
            } else {
                stack.push(num);
                total += num;
            }
        }
        System.out.println(total);

    }
}