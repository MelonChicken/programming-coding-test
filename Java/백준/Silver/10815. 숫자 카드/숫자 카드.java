import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while(st.hasMoreTokens()){
            map.put(st.nextToken(), 1);
        }

        int m =  Integer.parseInt(sc.nextLine());
        StringTokenizer st2 = new StringTokenizer(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        while(st2.hasMoreTokens()){
            String s = st2.nextToken();
            if(map.get(s) == null){
                map.put(s, 0);
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(s)).append(" ");
            }
        }
        System.out.println(sb);
    }
}