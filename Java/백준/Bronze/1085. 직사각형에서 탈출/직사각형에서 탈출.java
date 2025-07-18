import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        int x = Integer.parseInt(list[0]);
        int y = Integer.parseInt(list[1]);
        int w = Integer.parseInt(list[2]);
        int h = Integer.parseInt(list[3]);
        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);
        if(minX < minY){
            System.out.println(minX);
        } else {
            System.out.println(minY);
        }

    }
}