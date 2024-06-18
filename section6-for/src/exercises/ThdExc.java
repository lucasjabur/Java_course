package exercises;
import java.util.Scanner;

public class ThdExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int valorN;
        valorN = sc.nextInt();

        float valorA, valorB, valorC;

        for (int i = 0; i < valorN; i++) {
            valorA = sc.nextFloat();
            valorB = sc.nextFloat();
            valorC = sc.nextFloat();

            float media = (valorA*2 + valorB*3 + valorC*5) / 10;

            System.out.printf("Media: %.1f%n",media);
        }
        
        sc.close();
    }
}
