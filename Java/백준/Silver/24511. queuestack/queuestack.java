import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Deque<Integer>> arr = new ArrayList<>();
        String[] types = br.readLine().split(" ");
        String[] values = br.readLine().split(" ");
        Queue<String> q = new ArrayDeque<>();
        for(int i = n-1; i >= 0; i--){
            if(types[i].equals("0")){
                q.add(values[i]);
            }
        }

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            String s = st.nextToken();
            q.add(s);
            sb.append(q.poll()+" ");
        }
        System.out.println(sb);
    }
}