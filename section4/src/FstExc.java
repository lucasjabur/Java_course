import java.util.Scanner;

public class FstExc {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int soma;

        soma = num1+num2;

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
