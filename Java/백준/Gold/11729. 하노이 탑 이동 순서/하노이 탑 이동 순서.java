import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, "1", "3", "2");
        System.out.println(count+"\n"+sb);
    }
    public static void hanoi(int num, String source, String target, String spare) {
        // base case
        if(num == 1){
            count++;
            sb.append(source + " "+ target+"\n");
        }
        else {
            hanoi(num-1, source, spare, target);
            count++;
            sb.append(source + " "+ target+"\n");
            hanoi(num-1, spare, target, source);
        }
    }
}