import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] index = new int[2];
        int cnt = 0;
        while(true){
            String s = br.readLine();
            if(s==null) {
                break;
            } else {
                String[] row = s.split(" ");
                for(int i=0;i<row.length;i++){
                    int num = Integer.parseInt(row[i]);
                    if(num>max){
                        max = num;
                        index[0] = cnt;
                        index[1] = i;
                    }
                }
            }
            cnt++;
        }
        index[0] += 1;
        index[1] += 1;
        System.out.println(max+"\n"+index[0]+" "+index[1]);

    }
}