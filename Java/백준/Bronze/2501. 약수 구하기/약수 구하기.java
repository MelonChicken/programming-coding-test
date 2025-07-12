import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(k==1){
                System.out.print(1);
                cnt++;
                break;
            }
            if(n%i==0){
                cnt++;
                if(cnt==k){
                    System.out.print(i);
                    break;
                }
            }
        }
        if(cnt<k){
            System.out.print(0);
        }
    }
}