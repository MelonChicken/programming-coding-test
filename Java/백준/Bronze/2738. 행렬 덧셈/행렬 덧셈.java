import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);
        int[][] arr = new int[n][m];
        for(int i=0;i<2*n;i++){
            String[] row = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                arr[i%n][j] += Integer.parseInt(row[j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}