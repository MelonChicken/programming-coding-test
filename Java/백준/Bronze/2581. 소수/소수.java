import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = n;
        boolean[] sieve = new boolean[n+1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(sieve[i]){
                for(int j=i*i;j<=n;j+=i){
                    sieve[j] = false;
                }
            }
        }

        for(int i=m;i<=n;i++){
            if(sieve[i]){
                sum += i;
                if(i < min){
                    min = i;
                }
            }
        }
        if(sum==0){
            System.out.print(-1);
        } else {
            System.out.print(sum + "\n"+min);
        }
    }
}