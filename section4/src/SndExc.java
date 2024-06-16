import java.util.Scanner;

public class SndExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        raio = sc.nextDouble();

        double area;

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Área: %.4f%n", area);

    }
}
