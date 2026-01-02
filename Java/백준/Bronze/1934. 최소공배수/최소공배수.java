import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int result = 1;

        for(int i = 0; i < n; i++){
            String[] lines = br.readLine().split(" ");

            a = Integer.parseInt(lines[0]);
            b = Integer.parseInt(lines[1]);
            result = 1;

            if(a%b == 0 || b%a == 0){
                sb.append(Math.max(a,b)).append("\n");
                continue;
            }
            int min = Math.min(a, b);
            int divisor = 2;
            while(divisor < a || divisor < b){
                if(a%divisor==0 && b%divisor==0){
                    result *= divisor;
                    a /= divisor;
                    b /= divisor;
                } else {
                    divisor++;
                }
            }

            result *= a * b;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}