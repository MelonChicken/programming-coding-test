//  LJESNJAK 2941

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] testString = sc.nextLine().toCharArray();
        int totalWordNumber = 0;
        for(int i = 0; i < testString.length; i++) {
            if(i==0){
                totalWordNumber += 1;
                continue;
            }
            else{
                if(testString[i]=='='){
                    if(i<=1){
                        continue;
                    } else if(testString[i-2]=='d'&&testString[i-1]=='z'){
                        totalWordNumber -= 1;
                        continue;
                    } else{
                        continue;
                    }
                } else if(testString[i]=='-'){
                    continue;
                } else if (testString[i]=='j'&&(testString[i-1]=='l'||testString[i-1]=='n')){
                    continue;
                } else{
                    totalWordNumber += 1;
                }
            }
        }
        System.out.println(totalWordNumber);
    }
}