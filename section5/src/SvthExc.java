import java.util.Scanner;

public class SvthExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // ler valores float -> (x,y) coordenadas
        // determinar o quadrante que o ponto pertence ou se está sobre um dos eixos do plano ou na origem
            // origem escreva "Origem"
            // eixos escreva "Eixo X" ou "Eixo Y"
        
        float num1, num2;
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Origem");
        }

        else if(num1 == 0 && num2 != 0) {
            System.out.println("Eixo Y");
        }

        else if(num1 != 0 && num2 == 0) {
            System.out.println("Eixo X");
        }

        else if(num1 > 0 && num2 > 0) {
            System.out.println("Q1");
        }

        else if(num1 < 0 && num2 > 0) {
            System.out.println("Q2");
        }

        else if(num1 < 0 && num2 < 0) {
            System.out.println("Q3");
        }

        else if(num1 > 0 && num2 < 0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}
