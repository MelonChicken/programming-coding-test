import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        long a = Long.parseLong(line[0]);
        long b = Long.parseLong(line[1]);
        long tempB = b;
        long tempA = a;
        while(tempB != 0){
            long t = tempA % tempB;
            tempA = tempB;
            tempB = t;
        }
        System.out.println((a/tempA)*b);
    }
}