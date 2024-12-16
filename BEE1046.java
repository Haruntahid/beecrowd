import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int hours = 24;
        int ans;

        if(start < end) {
            ans = end-start;
        }else{
            ans = (hours - start)+end;
        }

        System.out.println("O JOGO DUROU "+ans+"HORA(S)");
    }
}
