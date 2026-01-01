import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n =  Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        HashMap<String, Integer> map = new HashMap<>();
        int total = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            map.put(br.readLine(), 1);
        }

        for(int i = 0; i < m; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(String key : map.keySet()){
            if(map.get(key)==2){
                total++;
                list.add(key);
            }
        }
        System.out.println(total);

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb);

    }
}