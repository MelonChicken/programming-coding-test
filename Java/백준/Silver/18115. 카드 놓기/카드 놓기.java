import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            if(arr[i].equals("1")) {
                deque.addLast(n - i);
            } else if(arr[i].equals("2")) {
                int tempA = deque.pollLast();
                deque.addLast(n - i);
                deque.addLast(tempA);
            } else if(arr[i].equals("3")) {
                deque.addFirst(n - i);
            }
        }
        while(!deque.isEmpty()) {
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.println(sb);
    }
}