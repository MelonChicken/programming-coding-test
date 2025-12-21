import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        if(n<=2){
            System.out.println(0);
        } else {
            System.out.println(n*(n-1)*(n-2)/6);
        }
        System.out.println(3);
    }
}