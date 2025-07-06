// 2720

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int change = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        for (int i = 0; i < n; i++) {
            change =  Integer.parseInt(br.readLine());
            quarter = change / 25;
            change -= quarter*25;
            dime = change / 10;
            change -= dime*10;
            nickel = change / 5;
            change -= nickel*5;
            penny = change / 1;
            change -= penny;
            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }

    }
}