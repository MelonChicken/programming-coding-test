import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1){
            System.out.print(1);
        }
        for(int i = 1; i <= n; i++){
            if(n<=3*i*(i-1)+1&&n>3*(i-1)*(i-2)+1) {
                System.out.print(i);
                break;
            }
        }

    }
}