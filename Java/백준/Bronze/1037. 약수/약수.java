import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(st.nextToken());
            if(temp > max){
                max = temp;
            }
            if(temp < min){
                min = temp;
            }
        }
        System.out.println(min * max);
    }
}