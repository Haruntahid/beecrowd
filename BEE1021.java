import java.util.Scanner;

public class Becloud1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();
        int poisa = (int) Math.round(money*100);

        System.out.println("NOTAS:");

        int hundreds = poisa / 10000;
        poisa %= 10000;
        int fifty = poisa / 5000;
        poisa %= 5000;
        int twenty = poisa / 2000;
        poisa %= 2000;
        int ten = poisa / 1000;
        poisa %= 1000;
        int five = poisa / 500;
        poisa %= 500;
        int two = poisa / 200;
        poisa %= 200;

        int one = poisa / 100;
        poisa %= 100;
        int h = poisa / 50;
        poisa %= 50;
        int e = poisa / 25;
        poisa %= 25;
        int t = poisa / 10;
        poisa %= 10;
        int f = poisa / 5;
        poisa %= 5;
        int o = poisa;



        System.out.println(hundreds + " nota(s) de R$ 100.00");
        System.out.println(fifty + " nota(s) de R$ 50.00");
        System.out.println(twenty + " nota(s) de R$ 20.00");
        System.out.println(ten + " nota(s) de R$ 10.00");
        System.out.println(five + " nota(s) de R$ 5.00");
        System.out.println(two + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(one + " moeda(s) de R$ 1.00");
        System.out.println(h + " moeda(s) de R$ 0.50");
        System.out.println(e + " moeda(s) de R$ 0.25");
        System.out.println(t + " moeda(s) de R$ 0.10");
        System.out.println(f + " moeda(s) de R$ 0.05");
        System.out.println(o + " moeda(s) de R$ 0.01");

    }
}
