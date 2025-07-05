import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        int[][] papers = new int[nums][2];
        int maxWidth = 0;
        int maxHeight = 0;
        int result = 0;
        for(int i=0;i<nums;i++){
            String[] line = br.readLine().split(" ");
            papers[i][0] = Integer.valueOf(line[0]);
            papers[i][1] = Integer.valueOf(line[1]);
            if(papers[i][0]+10>maxWidth){
                maxWidth = papers[i][0]+10;
            }
            if(papers[i][1]+10>maxHeight){
                maxHeight = papers[i][1]+10;
            }
        }

        int[][] extents = new int[maxWidth][maxHeight];
        for(int[] paper:papers){
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    extents[paper[0]+j][paper[1]+i] = 1;
                }
            }
        }

        for(int i=0;i<extents.length;i++){
            for(int j=0;j<extents[i].length;j++){
                result+=extents[i][j];
            }
        }
        System.out.println(result);
    }
}