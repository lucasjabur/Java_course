import java.util.Scanner;

public class SndExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int coordX, coordY;
        coordX = sc.nextInt();
        coordY = sc.nextInt();

        while (coordX != 0 && coordY != 0) {
            if (coordX > 0 && coordY > 0) {
                System.out.println("Primeiro quadrante.");
            }

            else if (coordX > 0 && coordY < 0) {
                System.out.println("Quarto quadrante.");
            }

            else if (coordX < 0 && coordY > 0) {
                System.out.println("Segundo quadrante.");
            }

            else {
                System.out.println("Terceiro quadrante.");
            }
            coordX = sc.nextInt();
            coordY = sc.nextInt();
        }

        System.out.println("");
    }
}
