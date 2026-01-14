import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < lines; i++){
            String[] nums = br.readLine().split(" ");
            int n =  Integer.parseInt(nums[1]);
            int k =  Integer.parseInt(nums[0]);
            sb.append(combination(n,k)).append("\n");
        }
        System.out.print(sb);

    }

    public static long combination(int n, int k) {
        long result = 1;

        if(n == k) return 1;
        if(n < 2*k) k = n - k;

        for(int i = 0; i < k; i++){
            result *= n-i;
        }
        for(int j = 1; j <= k; j++){
            result /= j;
        }

        return result;
    }
}