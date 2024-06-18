package exercises;
import java.util.Scanner;

public class FrthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorN;
        valorN = sc.nextInt();

        float numerador, denominador;

        for (int i = 0; i < valorN; i++) {
            numerador = sc.nextInt();
            denominador = sc.nextInt();
            
            if (denominador == 0) {
                System.out.println("Divisão impossível!");
            }
            
            else {
                float divisao = numerador / denominador;

                System.out.println("Resultado: "+divisao);
            }
        }

        sc.close();
    }
}
