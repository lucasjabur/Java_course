import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int senha = 2002, input;
        input = sc.nextInt();

        while (input != senha) {
            System.out.println("Senha inválida!");
            input = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

    }
}
