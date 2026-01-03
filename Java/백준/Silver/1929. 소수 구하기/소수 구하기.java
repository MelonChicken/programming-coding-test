import java.util.*;
import java.io.*;

class Main {
    public static boolean[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new boolean[m+1];
        StringBuilder sb = new StringBuilder();
        makeSlieve();
        
        for(int i = n; i <= m; i++){
            if(!arr[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    public static void makeSlieve(){
        arr[0] = true;
        arr[1] = true;
        for(int i = 2; i < arr.length; i++){
            if(arr[i]) continue;
            for(int j = 2; i*j < arr.length; j++){
                arr[i*j] = true;
            }
        }
    }
}