import java.util.Scanner;

public class ThdExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        
        int dif;

        dif = (num1 * num2) - (num3 * num4);

        System.out.println("Diferença: " + dif);

        sc.close();
    }
}
