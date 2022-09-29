package Test;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Beak1920 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int M = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<M;i++){
            if(BinarySearch(arr,in.nextInt()) >= 0 ){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int BinarySearch(int[] arr, int key){  //이분탐색

        int low = 0;
        int hi = arr.length-1;

        while(low <= hi){
            int mid = (low+hi)/2;

            if(key<arr[mid]){
                hi = mid-1;
            }
            else if (key>arr[mid]){
                low = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
