import java.util.Scanner;

public class FfthExc {
    public static void main(String []agrs) {
        Scanner sc = new Scanner(System.in);

        // leia codigo do item
        // leia quantidade do item
        // calcular e mostra o valor da compra

        int codigo, quantidade;
        double total;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Cachorro quente");
                total = 4.0 * quantidade;
                System.out.println("Total: R$ " + total);
                break;
            case 2:
                System.out.println("X-Salada");
                total = 4.5 * quantidade;
                System.out.println("Total: R$ " + total);
                break;
            case 3:
                System.out.println("X-Bacon");
                total = 5.0 * quantidade;
                System.out.println("Total: R$ " + total);
                break;
            case 4:
                System.out.println("Torrada simples");
                total = 2.0 * quantidade;
                System.out.println("Total: R$ " + total);
                break;
            case 5:
                System.out.println("Refrigerante");
                total = 1.5 * quantidade;
                System.out.println("Total: R$ " + total);
                break;
            default:
                throw new AssertionError();
    
        }

        sc.close();

    }
}
