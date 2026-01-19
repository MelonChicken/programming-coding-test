import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = getStars(n);
        StringBuilder sb = new StringBuilder();
        for(String s : result) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
    
    public static List<String> getStars(int n) {

        List<String> result = new ArrayList<>();

        if(n == 1) {
            result.add("*");
            return result;
        }

        List<String> smallStars = getStars(n/3);
        for(String s : smallStars) {
            result.add(s + s + s);
        }
        String blank = "";
        for(int i = 0; i < n / 3; i++){
            blank += " ";
        }

        for(String s : smallStars) {
            result.add(s + blank+ s);
        }

        for(String s : smallStars) {
            result.add(s + s + s);
        }
        return result;
    }
}