import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            arr[i][0] = x;
            arr[i][1] = y;
        }
        Arrays.sort(arr, new AxisComparator());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(arr[i][0] + " ");
            sb.append(arr[i][1] + "\n");
        }
        System.out.println(sb);
    }

    public static class AxisComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[0] != o2[0]){
                return o1[0] - o2[0];
            }
            if(o1[1] != o2[1]){
                return o1[1] - o2[1];
            }
            return 0;
        }

    }
}