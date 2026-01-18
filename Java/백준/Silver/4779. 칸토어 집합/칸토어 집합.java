import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static String s = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder resultSb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s == null || s.length() == 0){
                break;
            }
            int n = Integer.parseInt(s);
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < Math.pow(3, n); i++){
                sb.append('-');
            }
            System.out.println(split(sb.toString()));
        }
    }
    public static String split(String s){
        if(s.length() == 0) return "";
        if(s.length() == 1) return "-";
        if(s.length() == 3) return "- -";
        int subLen = s.length() / 3;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < subLen; i++){
            sb.append(" ");
        }
        return split(s.substring(0,subLen)) +sb.toString()+split(s.substring(2 * subLen, s.length()));

    }
}