import java.util.Scanner;

public class ThdExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2 && num1 % num2 == 0) {
            System.out.println("São múltiplos!");
        }
        else if (num2 > num1 && num2 % num1 == 0) {
            System.out.println("São múltiplos!");
        }
        else {
            System.out.println("Não são múltiplos!");
        }

        // para serem múltiplos o resto da divisão entre eles deve ser 0

    }
}