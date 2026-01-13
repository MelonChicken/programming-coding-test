import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.nextLine());
        Deque<Integer[]> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            Integer[] arr = new Integer[2];
            arr[0] = i;
            arr[1] = sc.nextInt();
            dq.addLast(arr);
        }
        while(!dq.isEmpty()){
            Integer[] num = dq.pollFirst();
            if(dq.isEmpty()){
                sb.append(num[0]);
                break;
            }
            sb.append(num[0]).append(" ");

            if(num[1] < 0){
                for(int i = num[1]; i < 0; i++){
                    dq.addFirst(dq.pollLast());
                }
            }
            if(num[1] > 0){
                for(int i =1; i<num[1]; i++){
                    dq.addLast(dq.pollFirst());
                }
            }
        }
        System.out.println(sb);
    }
}