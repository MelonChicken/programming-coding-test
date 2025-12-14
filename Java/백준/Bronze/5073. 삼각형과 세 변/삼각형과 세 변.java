import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines =  sc.nextLine().split(" ");

        while(!(lines[0].equals("0")&&lines[1].equals("0")&&lines[2].equals("0"))) {

            if(Integer.valueOf(lines[0]).compareTo(Integer.valueOf(lines[1])) > 0) {
                String tmp = lines[0];
                lines[0] = lines[1];
                lines[1] = tmp;
            }
            if(Integer.valueOf(lines[1]).compareTo(Integer.valueOf(lines[2])) > 0) {
                String tmp = lines[1];
                lines[1] = lines[2];
                lines[2] = tmp;
            }
            if(Integer.valueOf(lines[0]).compareTo(Integer.valueOf(lines[2])) > 0) {
                String tmp = lines[0];
                lines[0] = lines[2];
                lines[2] = tmp;
            }

            int min = Integer.valueOf(lines[0]);
            int middle = Integer.valueOf(lines[1]);
            int max = Integer.valueOf(lines[2]);

            if(min + middle <= max || max < middle - min) {
                System.out.println("Invalid");
            } else {
                if(min==middle&&max==middle) {
                    System.out.println("Equilateral");
                } else if(min==middle||max==middle||min==max){
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }

            lines = sc.nextLine().split(" ");
        }
    }
}