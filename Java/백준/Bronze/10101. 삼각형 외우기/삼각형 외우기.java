//  10101

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[3];
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++){
            nums[i] = Integer.valueOf(br.readLine());
            sum+=nums[i];
        }
        if(sum!=180){
            System.out.println("Error");
        } else {
            if(nums[0]==nums[1]&&nums[1]==nums[2]){
                System.out.println("Equilateral");
            } else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

    }
}