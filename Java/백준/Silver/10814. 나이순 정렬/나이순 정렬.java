import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = i + "";
            arr[i][1] = br.readLine();
        }
        Arrays.sort(arr, (a, b) -> {
            String[] person1 = a[1].split(" ");
            int person1Age = Integer.parseInt(person1[0]);

            String[] person2 = b[1].split(" ");
            int person2Age = Integer.parseInt(person2[0]);

            if(person1Age != person2Age){
                return person1Age - person2Age;
            }
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        StringBuilder sb = new StringBuilder();
        for(String[] data : arr){
            sb.append(data[1]).append("\n");
        }
        System.out.println(sb);
    }
}