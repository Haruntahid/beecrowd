import java.util.Arrays;
import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int [] arr = {a,b,c};

        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
