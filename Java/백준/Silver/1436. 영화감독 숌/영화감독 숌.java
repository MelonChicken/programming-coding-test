import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int num = 666;
        int count = 0;
        if(n==0){
            System.out.println("666");
            return;
        }

        for(int i=1; i<=n; i++){
            while(true){
                count = 0;
                String str = String.valueOf(num);
                if(str.contains("666")){
                    break;
                }
                num ++;
            }
            num++;
        }
        num--;
        System.out.println(num);
    }
}