import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int hour = 0;
        int minute=0;

        if(a<c && b<d){
            hour = c-a;
            minute = d-b;
        }else if(a==c && b==d){
            hour = (24-a)+c;
            minute = (60-b)+d;
            System.out.println("O JOGO DUROU "+hour +" HORA(S) E "+ minute +" MINUTO(S)");
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }


    }
}
