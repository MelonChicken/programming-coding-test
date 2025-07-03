// YourGPA 25206

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder   sb = new StringBuilder();

        double totalCourse = 0.0;
        double totalScore = 0.0;
        String s;
        double coursePoint;
        String scorePoint;

        while((s=br.readLine())!= null){
            double point=0.0;
            String[] list = s.split(" ");
            coursePoint=Double.valueOf(list[1]);
            scorePoint = list[2];
            if(scorePoint.equals("P")){
                continue;
            } else if(scorePoint.contains("+")){
                point += 0.5;
            }
            char letter = scorePoint.charAt(0);
            switch (letter) {
                case 'A': point += 4.0; break;
                case 'B': point += 3.0; break;
                case 'C': point += 2.0; break;
                case 'D': point += 1.0; break;
                case 'F': point += 0.0; break;
                default:
                    throw new IllegalArgumentException("Wrong Point: " + point);
            }
            totalCourse += coursePoint;
            totalScore += coursePoint*point;
        }
        System.out.printf("%.6f",totalScore/totalCourse);
    }
}