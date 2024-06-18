package exercises;
import java.util.Scanner;

public class SthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        double areaTriang;
        areaTriang = (num1 * num3)/2;

        double areaCirc;
        areaCirc = Math.PI * Math.pow(num3, 2);

        double areaTrap;
        areaTrap = ((num1 + num2)/2) * num3;

        double areaQuad;
        areaQuad = Math.pow(num2, 2);

        double areaRet;
        areaRet = num1 * num2;

        System.out.println("Triângulo: " + areaTriang);
        System.out.println("Circulo: " + areaCirc);
        System.out.println("Trapézio: " + areaTrap);
        System.out.println("Quadrado: " + areaQuad);
        System.out.println("Retângulo: " + areaRet);

        sc.close();
    }
}
