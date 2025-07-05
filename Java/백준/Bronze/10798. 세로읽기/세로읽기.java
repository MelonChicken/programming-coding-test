import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] result = new char[75];
        int cnt = 0;
        for(int i = 0;i<5;i++){
            String line = br.readLine();
            if(line == null){
                break;
            }
            char[] rows =  line.toCharArray();
            for(int j = 0;j<rows.length;j++){
                result[j*5+i] = rows[j];
            }
        }

        for(int i = 0; i<75; i++){
            if(result[i] != '\0'){
                sb.append(result[i]);
            }
        }
        System.out.println(sb.toString());
    }
}