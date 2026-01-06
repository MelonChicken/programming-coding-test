import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        Deque<Integer> stack = new ArrayDeque<>();
        int target = 1;
        for (int i = 0; i < n; i++) {
            int next = Integer.parseInt(st.nextToken());
            if(target == next){
                target++;
            } else {
                stack.push(next);
            }
            while(!stack.isEmpty()&&stack.peek()==target){
                stack.pop();
                target++;
            }
        }

       while(!stack.isEmpty()&&target == stack.peek()){
           stack.pop();
           target++;
       }

        if(target == n + 1){
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}