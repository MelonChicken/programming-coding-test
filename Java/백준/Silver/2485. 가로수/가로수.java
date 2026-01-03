import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] positions = new long[n];
        long[] gaps = new long[n-1];
        long currentGcd = 1;

        for(int i=0;i<n;i++){
            positions[i] = Long.parseLong(br.readLine());
            if(i > 0){
                gaps[i-1] = positions[i] - positions[i-1];
            }
            if(i == n-1){
                break;
            }
        }

        Arrays.sort(positions);

        for(int i=0;i<n-1;i++){
            if(i == 1){
                currentGcd = gcd(gaps[i-1], gaps[i]);
            } else if (i > 1){
                currentGcd = gcd(currentGcd, gaps[i]);
            }
        }

        int i = 0;
        int j = 0;
        long start = positions[0];
        int count = 0;

        while((start + currentGcd * j) <= positions[positions.length-1]){
            if(positions[i] == start + currentGcd * j){
                i ++;
                j ++;
                continue;
            } else {
                count++;
                j ++;
            }
        }
        System.out.println(count);
    }

    public static long gcd(long a,long b){

        while(b != 0){
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}