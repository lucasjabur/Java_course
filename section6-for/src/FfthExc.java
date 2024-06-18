import java.util.Scanner;

public class FfthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorN, temp, fatorial = 1;
        valorN = sc.nextInt();
        
        temp = valorN;

        for (int i = 0; i < valorN; i++) {
            fatorial *= temp;
            temp -= 1;
        }

        System.out.printf("Fatorial de %d: %d%n",valorN, fatorial);

    }
}
