import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstInput = sc.nextLine();
        String secondInput = sc.nextLine();
        String thirdInput = sc.nextLine();


        if (firstInput.equals("vertebrado")) {
            if (secondInput.equals("ave")) {
                if (thirdInput.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (thirdInput.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (secondInput.equals("inseto")) {
                if (thirdInput.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (thirdInput.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
