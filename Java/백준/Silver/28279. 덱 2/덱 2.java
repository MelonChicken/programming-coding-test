import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<String> dq = new ArrayDeque<>();
        for(int j = 0; j<n; j++){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("1")){
                dq.addFirst(cmd[1]);
                continue;
            }
            if(cmd[0].equals("2")){
                dq.addLast(cmd[1]);
                continue;
            }
            if(cmd[0].equals("3")){
                if(!dq.isEmpty()){
                    sb.append(dq.pollFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
                continue;
            }
            if(cmd[0].equals("4")){
                if(!dq.isEmpty()){
                    sb.append(dq.pollLast()).append("\n");
                }  else {
                    sb.append("-1\n");
                }
                continue;
            }
            if(cmd[0].equals("5")){
                sb.append(dq.size()).append("\n");
                continue;
            }
            if(cmd[0].equals("6")){
                if(!dq.isEmpty()){
                    sb.append("0\n");
                }  else {
                    sb.append("1\n");
                }
                continue;
            }
            if(cmd[0].equals("7")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekFirst()).append("\n");
                } else {
                    sb.append("-1\n");
                }
                continue;
            }
            if(cmd[0].equals("8")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekLast()).append("\n");
                } else {
                    sb.append("-1\n");
                }
                continue;
            }
        }
        System.out.println(sb);

    }
}