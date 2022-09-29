import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위","바위","보"};
        String input = "";
        System.out.print("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            int i = (int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            input = scanner.next();
            if(input.equals("그만"))
                break;
            if(str[i].equals(input))
                System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 비겼습니다.");  //비기는 수
            if(input.equals("가위")) {
                if(str[i].equals("바위"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 졌습니다."); //이중으로 if조건문을 사용했습니다. 가위일때 바위라면과 가위일때 보라면을 나타냅니다.
                else if(str[i].equals("보"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 이겼습니다.");
            }
            if(input.equals("바위")) {
                if(str[i].equals("가위"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 이겼습니다.");
                else if(str[i].equals("보"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 졌습니다.");
            }
            if(input.equals("보")) {
                if(str[i].equals("가위"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 졌습니다.");
                else if(str[i].equals("바위"))
                    System.out.println("사용자: "+input+" 컴퓨터: "+str[i]+" 이겼습니다.");
            }
        }
    }
}