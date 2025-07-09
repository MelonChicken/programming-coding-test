import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] axis = {1,1};
        boolean isEdge = true;
        boolean isUp = true;
        if(n>1){
            for(int i = 0; i < n-1; i++){
                if(axis[0]==1&&isEdge){
                    axis[1]+=1;
                    isEdge = false;
                    isUp = !isUp;
                    continue;
                }

                if(axis[1]==1&&isEdge){
                    axis[0]+=1;
                    isEdge = false;
                    isUp = !isUp;
                    continue;
                }

                if(isUp){
                    axis[0]-=1;
                    axis[1]+=1;
                    if(axis[0]==1){
                        isEdge = true;
                    }
                } else{
                    axis[0]+=1;
                    axis[1]-=1;
                    if(axis[1]==1){
                        isEdge = true;
                    }
                }
            }
        }

        System.out.println(axis[0]+"/"+axis[1]);
    }
}