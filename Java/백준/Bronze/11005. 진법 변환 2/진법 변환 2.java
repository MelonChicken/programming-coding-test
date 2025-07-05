import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int target = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        System.out.print(Integer.toString(target,n).toUpperCase());

    }
}