import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n =  Integer.parseInt(s[0]);
        int m =  Integer.parseInt(s[1]);

        String[] arr = sc.nextLine().split(" ");
        int[] cards = new int[n];
        for(int i = 0; i < n; i++){
            cards[i] = Integer.parseInt(arr[i]);
        }

        int total = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(total < cards[i]+cards[j]+cards[k] && cards[i]+cards[j]+cards[k] <=m){
                        total = cards[i]+cards[j]+cards[k];
                    }
                }
            }
        }
        System.out.println(total);
    }
}