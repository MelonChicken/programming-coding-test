import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String status = st.nextToken();
            if(!set.contains(person) && status.equals("enter")){
                set.add(person);
            } else {
                if(status.equals("leave")){
                    set.remove(person);
                }
            }
        }
        ArrayList<String> persons = new ArrayList<>(set);
        Collections.sort(persons, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Object person : persons){
            sb.append(person).append("\n");
        }
        System.out.println(sb);
    }
}