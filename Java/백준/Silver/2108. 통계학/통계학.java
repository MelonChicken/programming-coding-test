import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        int freq = 4001;
        int cnt = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[n];
        map.put(freq, -1);

        for(int i = 0; i < n; i++){
            int temp =  Integer.parseInt(br.readLine());
            if(temp < min) min = temp;
            if(temp > max) max = temp;

            total += temp;

            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            } else {
                map.put(temp,1);
            }
            arr[i] = temp;
        }
        for(Integer key : map.keySet()){
            if(map.get(key).equals(-1)){
                continue;
            }
            if(map.get(key).equals(cnt)){
                arrayList.add(key);
            }
            if(map.get(key).compareTo(cnt)>0){
                arrayList.clear();
                arrayList.add(key);
                cnt = map.get(key);
            }
        }
        Arrays.sort(arr);
        arrayList.sort(Collections.reverseOrder());
        System.out.println(Math.round(1.0 * total / n));
        System.out.println(arr[n/2]);
        if(arrayList.size() == 1){
            System.out.println(arrayList.get(0));
        } else {
            System.out.println(arrayList.get(arrayList.size()-2));
        }
        System.out.println(max-min);
    }
}