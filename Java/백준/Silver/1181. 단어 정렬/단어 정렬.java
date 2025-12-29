import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String word = br.readLine();
            if(words.contains(word)){
                continue;
            }
            words.add(word);
        }

        words.sort(new StringComparator());

        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }

    public static class StringComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() != o2.length()){
                return o1.length() - o2.length();
            }
            if(!o1.equals(o2)){
                return o1.compareTo(o2);
            }
            return 0;
        }
    }
}