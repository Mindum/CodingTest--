package Test;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;
//수 찾기 ( 이분 탐색 )  이해 절대 안댐
public class Beak1920 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr); //탐색을 하려면 정렬이 되어있어야 한다.

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
