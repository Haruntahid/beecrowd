import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();


        float avg = ((a*2 + b*3 + c*4 + d*1) / (2+3+4+1));

        System.out.printf("Media %.1f\n" ,avg);

        if(avg >= 7){
            System.out.println("Aluno aprovado.");
        } else if (avg < 5) {
            System.out.println("Aluno reprovado.");
        }else if(avg >= 5 && avg < 7){
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: ");
            float e = sc.nextFloat();
            float result = (avg+e)/2;

            if(result >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f", result);
            }
        }


    }
}
