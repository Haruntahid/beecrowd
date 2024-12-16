import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if(a+b > c && b+c>a && c+a>b){
            float area = (a+b+c);
            System.out.printf("Perimetro = %.1f\n", area);
        }else{
            float area = (a+b)/2 *c;
            System.out.printf("Area = %.1f\n", area);
        }

    }
}
