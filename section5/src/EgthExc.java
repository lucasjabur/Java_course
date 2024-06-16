import java.util.Scanner;

public class EgthExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // ler valor double salario
        // calcule e mostra o pagamento de imposto seguindo a tabela
        
        double salario;
        salario = sc.nextDouble();

        if (salario > 0.00 && salario <= 2000.00) {
            System.out.println("Isento");
        }

        else if (salario >= 2000.01 && salario <= 3000.00) {
            double imposto;
            imposto = salario - (salario - (salario*0.08));
            System.out.printf("Imposto: %.2f%n",imposto);
        }

        else if (salario >= 3000.01 && salario <= 4500.00) {

            // RACIOCÍNIO USADO:

            /* 
            double imposto;
            salario = salario - 2000;

            double imp1 = 1000 - (1000 - (1000*0.08)); // 80
            double imp2 = (salario - 1000) - ((salario - 1000) - ((salario - 1000)*0.18));

            imposto = imp1+imp2;
            System.out.printf("Imposto: %.2f%n",imposto);
            */


            // MELHORAMENTO DESTE RACIOCÍNIO:

            salario = salario - 2000;

            double imposto = ((salario - 1000) - ((salario - 1000) - ((salario - 1000)*0.18))) + 80;

            System.out.printf("Imposto: %.2f%n",imposto);
        }

        else if (salario > 4500) {

            // RACIOCÍNIO USADO: 
            /* 
            double imposto;
            salario = salario - 2000;

            double imp1 = 1000 - (1000 - (1000*0.08)); // 80
            double imp2 = 1500 - (1500 - (1500*0.18)); // 270
            double imp3 = (salario - 2500) - ((salario - 2500) - ((salario - 2500)*0.28));

            imposto = imp1+imp2+imp3;
            System.out.printf("Imposto: %.2f%n",imposto); 
            */

            
            // MELHORAMENTO DESTE RACIOCÍNIO: 

            salario = salario - 2000;
            
            double imposto = ((salario - 2500) - ((salario - 2500) - ((salario - 2500)*0.28))) + 80 + 270;
            
            System.out.printf("Imposto: %.2f%n",imposto);
        }

    }
}
