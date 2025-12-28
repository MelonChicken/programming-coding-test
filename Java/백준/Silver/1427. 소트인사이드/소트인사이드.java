import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        while(true){
            count = 0;
            for(int i = 0; i < s.length(); i++){
                if(i == s.length()-1){
                    break;
                }
                if(s.charAt(i) < s.charAt(i+1)){
                    s = swap(i, i+1, s);
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }
        System.out.println(s);
    }
    public static String swap(int idx1, int idx2, String s){
        char temp = s.charAt(idx1);
        s = s.substring(0, idx1) + s.charAt(idx2) + s.substring(idx1 + 1);
        s = s.substring(0, idx2) + temp + s.substring(idx2 + 1);
        return s;
    }
}