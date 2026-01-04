import java.util.*;
import java.io.*;
import java.lang.Math;

class Main {

    public static boolean[] nums = new boolean[246913];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt;
        makeSlieve();
        while(true){
            String line = br.readLine();
            if(line.equals("0")) break;
            cnt = 0;
            int n = Integer.parseInt(line);
            for(int i = n+1; i <= 2*n; i++){
                if(!nums[i]){
                    cnt += 1;
                } else {
                    continue;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

    }

    public static void makeSlieve(){
        for(int i = 2; i <= 496; i++){
            if(nums[i]){
                continue;
            }
            for(int j = 1; j <= 246912; j++){
                if(nums[j]) continue;
                if(j == i) continue;
                if(j % i == 0){
                    nums[j] = true;
                }
            }
        }
        nums[0] = true;
        nums[1] = true;
    }
}