package exercises;
import java.util.Scanner;

public class ThdExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, alcool = 0, gasolina = 0, diesel = 0;
        opcao = sc.nextInt();

        while (opcao != 4) {

            if (opcao == 1) {
                alcool += 1;
            }
            else if (opcao == 2) {
                gasolina += 1;
            }
            else if (opcao == 3) {
                diesel += 1;
            }
            opcao = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.println("Álcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
        
        sc.close();
    }
}
