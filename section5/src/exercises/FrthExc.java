package exercises;
import java.util.Scanner;

public class FrthExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        // ler horar inicial e final do jogo
        // calcular duração do jogo
            // pode começar em um dia e terminar em outro
            // duracao minima de 1 hr e max de 24 hrs

        int horaInicial, horaFinal;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        
        if (horaInicial < horaFinal) {
            int duracao = horaFinal - horaInicial;
            System.out.printf("O jogo durou %d horas.%n", duracao);
        }

        else if (horaInicial == horaFinal) {
            System.out.println("O jogo durou 24 horas.%n");
        }

        else {
            int duracao = 24 - horaInicial + horaFinal;
            System.out.printf("O jogo durou %d horas.%n", duracao);
        }

        sc.close();
    }
}
