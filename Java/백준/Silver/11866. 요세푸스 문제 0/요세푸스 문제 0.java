import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size()>0){
            for(int j = 0; j<k-1; j++){
                q.add(q.poll());
            }
            if(q.size()==1){
                sb.append(q.poll());
            } else {
                sb.append(q.poll()).append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}