import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long target;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            target = Long.parseLong(s);
            long current = target;
            while(true){
                if(isPrime(current)){
                    sb.append(current).append("\n");
                    break;
                }
                current++;
            }
        }
        System.out.print(sb);
    }
    public static boolean isPrime(long n){
        if(n == 1 || n == 0) return false;
        if(n == 2) return true;
        for(long i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}