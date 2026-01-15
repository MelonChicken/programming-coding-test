import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int total = 0;
        for (int i = 0; i < n; i++) {
            String line =  br.readLine();
            if(line.equals("ENTER")){
                set.clear();
                continue;
            }
            if(!set.contains(line)){
                total ++;
                set.add(line);
            }
        }
        System.out.println(total);

    }
}