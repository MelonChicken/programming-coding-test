import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> subStrings = new HashSet<>();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                subStrings.add(s.substring(i, j+1));
            }
        }
        System.out.println(subStrings.size());
    }
}