package Test;

import java.util.Scanner;

public class Beak1074 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int r = in.nextInt();
        int c = in.nextInt();
        int size = (int) Math.pow(2,N);


    }


    private static void search(int size, int r, int c){
        if ( size ==1 ){
            return;
        }
        if( r < size/2 && c < size/2){ // 1사분면에 존재하는지를 체크
            search(size/2, r,c);
        }
        else if(r < size/2 && c >= size/2){  // 2사분면에 존재하는지를 체크
            count += size * size / 4; // 2사분면을 가면 1분면을 들려야 하기 때문에 size * size
            search(size/2,r,c-size/2);
        }
        else if ( r >= size/2 && c < size/2){ // 3사분면에 존재하는지를 체크
            count += ( size * size / 4) * 2;//3사분면을 가면 1,2을 들려야 하기 때문에 * 2를 해줌
            search(size/2, r - size/2,c);
        }
        else { //4사분면에 존재를 한다면
            count += (size * size / 4) * 3;// 4사분명을 가려면 1,2,3을 들려야 하기 때문에 * 3을 해준다.
            search(size/2, r - size/2, c - size/2);
        }

    }
}
