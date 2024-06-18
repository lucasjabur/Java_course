package exercises;
import java.util.Scanner;

public class FrthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        num = sc.nextInt();

        int horas;
        horas = sc.nextInt();

        double valor;
        valor = sc.nextDouble();

        double salario;
        salario = horas * valor;

        System.out.println("Número: " + num);
        System.out.println("Salário: U$ " + salario);

        sc.close();
    }
}
