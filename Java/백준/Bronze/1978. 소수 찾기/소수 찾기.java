// 1978

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int result = n;
        String[] arr = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int num = Integer.valueOf(arr[i]);
            if(num == 1){
                result -= 1;
                continue;
            }
            if(num == 2){
                continue;
            }
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    result -= 1;
                    break;
                }
            }
        }
        System.out.print(result);
    }
}