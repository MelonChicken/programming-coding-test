import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        ArrayList<String> arrList = new ArrayList<>(set);

        arrList.sort((a,b)-> {
            return Integer.valueOf(a).compareTo(Integer.valueOf(b));
        });
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arrList.size(); i++) {
            map.put(arrList.get(i), i);
        }
        StringBuilder sb = new StringBuilder();
        for(String num : arr){
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}