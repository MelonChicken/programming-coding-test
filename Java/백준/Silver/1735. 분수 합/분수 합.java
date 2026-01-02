import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        long[] first = new long[2];
        long[] second = new long[2];
        long[] target = new long[2];

        first[0] = Long.parseLong(s1[0]);
        first[1] = Long.parseLong(s1[1]);

        second[0] = Long.parseLong(s2[0]);
        second[1] = Long.parseLong(s2[1]);

        target[0] = first[0] * second[1] + second[0] * first[1];
        target[1] = first[1] * second[1];

        long gcd =  target[0];
        long tempB = target[1];
        while(tempB != 0){
            long t = gcd % tempB;
            gcd = tempB;
            tempB = t;
        }

        target[0] /= gcd;
        target[1] /= gcd;

        System.out.println(target[0] + " " + target[1]);
    }
}