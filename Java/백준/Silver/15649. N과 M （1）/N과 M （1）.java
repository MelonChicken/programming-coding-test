import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[] tempArr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        tempArr = new int[r];
        visited = new boolean[n+1];

        for(int i = 1; i <= r; i++){
            tempArr[i-1] = i;
        }
        sequence(n, 0);
        System.out.println(sb);

    }
    public static void sequence(int n, int depth){
        if(depth == tempArr.length){
            for(int i = 0; i < tempArr.length; i++){
                sb.append(tempArr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                visited[i] = true;
                tempArr[depth] = i;
                sequence(n, depth + 1);
                visited[i] = false;
            }
        }
    }
}