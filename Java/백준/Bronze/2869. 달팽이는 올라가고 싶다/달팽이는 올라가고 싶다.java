import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int v = Integer.parseInt(tokens[2]);
        if(v%(a-b)==0){
            System.out.print(v/(a-b)-(b/(a-b)));
        } else if (v%(a-b)<=b){
            System.out.print(v/(a-b)-(b/(a-b)));
        } else {
            System.out.println(v/(a-b)+1);
        }
    }
}