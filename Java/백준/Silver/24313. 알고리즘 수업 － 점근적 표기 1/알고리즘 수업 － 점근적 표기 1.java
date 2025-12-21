import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a0 = Integer.valueOf(s[1]);
        int a1 = Integer.valueOf(s[0]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        boolean flag = true;
        int n = n0;
        while(flag&&(n < 100)){
            flag = (a1*n+a0) <= c*n;
            if(!flag) {
                System.out.println(0);
                break;
            }
            n += 10;
        }
        if(flag){
            System.out.println(1);
        }

    }
}