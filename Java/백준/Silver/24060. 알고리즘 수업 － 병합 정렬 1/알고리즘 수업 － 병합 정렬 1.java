import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int count = 0;
    public static int target = 0;
    public static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cmds = br.readLine().split(" ");
        int n = Integer.parseInt(cmds[0]);
        int k = Integer.parseInt(cmds[1]);
        int[] array = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(array, 0, array.length-1, k);
        if(count < k){
            System.out.println(-1);
        } else {
            System.out.println(result);
        }

    }
    public static void mergeSort(int[] arr, int start, int end, int k){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(arr, start, mid, k);
            mergeSort(arr, mid+1, end, k);
            merge(arr, start, mid, end, k);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end, int k){
        int i =  start;
        int j = mid+1;
        int t = 0;
        int[] tmp = new int[end-start+1];
        while(i <= mid && j <= end){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }
        while(i <= mid){
            tmp[t++] = arr[i++];
        }
        while(j <= end){
            tmp[t] = arr[j];
            j++;
            t++;
        }
        i = start;
        t = 0;
        while(i <= end){
            arr[i] = tmp[t];
            target = arr[i];
            count++;
            if(count == k){
                result = target;
            }
            i++;
            t++;
        }
    }
}