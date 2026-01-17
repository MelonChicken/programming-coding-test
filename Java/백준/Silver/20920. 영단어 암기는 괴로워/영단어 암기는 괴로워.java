import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cmds = br.readLine().split(" ");
        int n = Integer.parseInt(cmds[0]);
        int m = Integer.parseInt(cmds[1]);
        HashMap<String, EnglishWord> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            String word = br.readLine();
            if(word.length() < m) continue;
            if(!map.containsKey(word)) {
                map.put(word, new EnglishWord(word));
            } else {
                map.get(word).updateCnt();
            }
        }
        List<EnglishWord> list = map.values().stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();

        for(EnglishWord word : list) {
            sb.append(word.word+"\n");
        }

        System.out.println(sb.toString());

    }
    static class EnglishWord implements Comparable<EnglishWord>{
        String word;
        int cnt;

        public EnglishWord(String word) {
            this.word = word;
            this.cnt = 1;
        }

        @Override
        public int compareTo(EnglishWord anotherWord){

            if(cnt - anotherWord.cnt != 0){
                return cnt - anotherWord.cnt;
            }

            if(word.length() - anotherWord.word.length() != 0){
                return word.length() - anotherWord.word.length();
            }

            return -1 * word.compareTo(anotherWord.word);
        }

        @Override
        public String toString(){
            return this.word;
        }
        public void updateCnt(){
            cnt++;
        }
    }
}