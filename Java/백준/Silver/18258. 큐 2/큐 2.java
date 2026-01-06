import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String[] cmds = br.readLine().split(" ");
            if(cmds[0].contains("push")){
                int num = Integer.parseInt(cmds[1]);
                q.add(num);
            }
            if(cmds[0].contains("pop")){
                if(!q.isEmpty()){
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            }
            if(cmds[0].contains("size")){
                sb.append(q.size()).append("\n");
            }
            if(cmds[0].contains("empty")){
                sb.append(q.isEmpty() ? 1 : 0).append("\n");
            }
            if(cmds[0].contains("front")){
                if(!q.isEmpty()){
                    sb.append(q.peekFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            }
            if(cmds[0].contains("back")){
                if(!q.isEmpty()){
                    sb.append(q.peekLast()).append("\n");
                } else {
                    sb.append("-1\n");
                }
            }
        }
        System.out.println(sb);
    }
}