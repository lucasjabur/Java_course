package exercises;
import java.util.Scanner;

public class SthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorN, divisor = 1;
        valorN = sc.nextInt();

        for (int i = 0; i < valorN; i++) {
            if (valorN % divisor == 0) {
                System.out.println(divisor);
                divisor++;
            }
            
            else {
                divisor++;
            }
        }

        sc.close();
    }
}
