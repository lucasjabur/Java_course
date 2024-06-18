package exercises;
import java.util.Scanner;

public class FstExc {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int valorX;
        valorX = sc.nextInt();

        for (int i = 0; i < valorX+1; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
