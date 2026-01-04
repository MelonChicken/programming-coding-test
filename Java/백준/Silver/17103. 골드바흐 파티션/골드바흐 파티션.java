import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.io.IOException;

class Main {
    public static boolean[] slieve = new boolean[1000000];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count;
        makeSlieve();
        for(int i = 0; i < n; i++){
            int r =  Integer.parseInt(br.readLine());
            count = 0;
            for(int j = 2; j + j <= r ; j++){
                if(!slieve[j] && !slieve[r - j]){
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }

    public static void makeSlieve(){
        slieve[0] = true;
        slieve[1] = true;
        for (int i = 2; i * i < slieve.length; i++) {
            if (slieve[i]) continue;
            for (int j = i * i; j < slieve.length; j += i) {
                slieve[j] = true;
            }
        }
    }
}