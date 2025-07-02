import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textCount = sc.nextInt();
        int resultWord = textCount;
        for(int i=0;i<textCount;i++){
            char[] word = sc.next().toCharArray();
            String tmpWordList = "";
            for(int j=0;j<word.length;j++){
                if(j==0){
                    tmpWordList+=word[j];
                } else{
                    if(word[j] == word[j-1]){
                        continue;
                    } else {
                        if(tmpWordList.contains(word[j]+"")){
                            resultWord--;
                            break;
                        } else{
                            tmpWordList+=word[j];
                        }
                    }
                }
            }
        }
        System.out.println(resultWord);
    }
}