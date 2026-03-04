import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static boolean[] visited;
    public static int[] arr;
    public static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        visited = new boolean[n+1];
        arr = new int[m];
        sb = new StringBuilder();
        sequence(n, 0);
        System.out.println(sb.toString());
    }

    public static void sequence(int n, int depth){
        if(depth == arr.length){
            for(int i = 0; i < arr.length; i++){
                sb.append(arr[i]+" ");
            }
            sb.append('\n');
            return;
        }
        if(depth == 0){
            for(int i = 1; i <= n; i++){
                visited[i] = true;
                arr[depth] = i;
                sequence(n, depth+1);
                visited[i] = false;
            }
        } else {
            for(int i = arr[depth-1] + 1; i <= n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[depth] = i;
                    sequence(n, depth+1);
                    visited[i] = false;
                }
            }
        }
    }
}