import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sticks = {a,b,c};
        Arrays.sort(sticks);

        if(sticks[2] < sticks[0] + sticks[1]){
            System.out.println(Arrays.stream(sticks).sum());
            return;
        }

        System.out.println(2*(sticks[0] + sticks[1])-1);
    }

}