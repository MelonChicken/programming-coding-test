//  3009
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line;
        int[][] axis = new int[2][3];
        int[] answer = new int[2];
        for (int i = 0; i < 3; i++) {
            line = br.readLine().split(" ");
            axis[0][i] = Integer.parseInt(line[0]);
            axis[1][i] = Integer.parseInt(line[1]);
        }
        for(int i=0;i<2;i++){
            int[] tmp = {0, 0};
            for(int j=0;j<3;j++){
                if(j==0){
                    tmp[0] = axis[i][j];
                } else {
                    if(tmp[1]==0 && axis[i][j]!=tmp[0]){
                        tmp[1] = axis[i][j];
                        if(j==2){
                            answer[i] = tmp[1];
                        }
                    } else if(axis[i][j]==tmp[0]&&tmp[1]!=0){
                        answer[i] = tmp[1];
                    } else if(axis[i][j]==tmp[1]){
                        answer[i] = tmp[0];
                    }
                }
            }
        }
        System.out.println(answer[0]+" "+answer[1]);
    }
}