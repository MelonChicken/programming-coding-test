import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String candidate;
        long total = 0;
        long n = Long.parseLong(s);
        int digit;

        for (long i = n - 9*s.length(); i < n; i++) {
            candidate = String.valueOf(i);
            for(int j = 0; j < candidate.length(); j++) {
                digit = candidate.charAt(candidate.length() - j - 1) - '0';
                total += digit;
            }
            total += i;
            if(total == n){
                System.out.println(i);
                return;
            }
            total = 0;
        }
        System.out.println(0);
    }
}