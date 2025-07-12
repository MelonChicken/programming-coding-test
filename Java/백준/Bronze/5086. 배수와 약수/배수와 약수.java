import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if(a==0&&b==0){
                break;
            }
            if(a%b == 0){
                System.out.println("multiple");
            } else if(b%a == 0){
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}