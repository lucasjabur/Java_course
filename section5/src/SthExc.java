import java.util.Scanner;

public class SthExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // ler um valor
        // mensagem dizendo em qual dos intervalos o valor se encontra
            // se n tiver em nenhum, imprime "Fora do intervalo"
    
        double valor;
        valor = sc.nextDouble();
        
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0, 25]");
        }

        else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25, 50]");
        }

        else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50, 75]");
        }

        else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75, 100]");
        }

        else {
            System.out.println("Fora de intervalo!");
        }
    }
}
