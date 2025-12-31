import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String m = br.readLine();
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        while(st2.hasMoreTokens()){
            int q = Integer.parseInt(st2.nextToken());
            sb.append(map.getOrDefault(q, 0)).append(" ");
        }

        System.out.println(sb);
    }
}