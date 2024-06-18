import java.util.Scanner;

public class FfthExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, numPcs1, cod2, numPcs2;
        double valPcs1, valPcs2;

        cod1 = sc.nextInt();
        numPcs1 = sc.nextInt();
        valPcs1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        numPcs2 = sc.nextInt();
        valPcs2 = sc.nextDouble();

        double valorTotal;
        valorTotal = numPcs1*valPcs1 + numPcs2*valPcs2;

        System.out.println("Valor: " + valorTotal);

        sc.close();
    }
}
