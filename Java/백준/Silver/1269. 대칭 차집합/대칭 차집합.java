import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);
        int count = 0;

        HashSet<String> setA = new HashSet<>(n);
        HashSet<String> setB = new HashSet<>(m);
        HashSet<String> setAorB = new HashSet<>();
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        while(stA.hasMoreTokens()){
            String temp = stA.nextToken();
            setA.add(temp);
            setAorB.add(temp);
        }

        while(stB.hasMoreTokens()){
            String temp = stB.nextToken();
            setB.add(temp);
            setAorB.add(temp);
        }

        for(String a : setAorB){
            if(setA.contains(a)&&setB.contains(a)){
                count++;
            }
        }

        System.out.println(setAorB.size()-count);
    }
}