import java.util.Scanner;

public class SvthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorN;
        valorN = sc.nextInt();

        for (int i = 1; i < valorN+1; i++) {
            double quad = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f%n",i, quad, cubo);
        }

    }
}
