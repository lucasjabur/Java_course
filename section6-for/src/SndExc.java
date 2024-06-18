import java.util.Scanner;

public class SndExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int valorN, valorX;
        valorN = sc.nextInt();

        for (int i = 1; i < valorN+1; i++) {
            valorX = sc.nextInt();

            if (valorX >= 10 && valorX <= 20) {
                System.out.printf("%d in%n",i);
            }

            else {
                System.out.printf("%d out%n",i);
            }
        }

    }
}
