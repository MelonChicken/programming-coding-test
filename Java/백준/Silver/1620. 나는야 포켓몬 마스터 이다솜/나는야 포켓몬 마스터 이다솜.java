import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] names = new String[n+1];
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++){
            String pokemon = br.readLine();
            names[i] = pokemon;
            map.put(pokemon, i);
        }

        for(int i = 0; i < m; i++){
            String question = br.readLine();
            if(question.toUpperCase().equals(question)){
                int index = Integer.parseInt(question);
                sb.append(names[index]).append("\n");
            } else {
                sb.append(map.get(question)).append("\n");
            }
        }

        System.out.println(sb);
    }
}