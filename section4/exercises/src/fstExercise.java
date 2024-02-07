import java.util.Scanner;

public class fstExercise {

    public void firstExercise(){
    int num1, num2, sum;

    Scanner sc = new Scanner(System.in);

    num1 = sc.nextInt();
    num2 = sc.nextInt();
    sc.nextLine();

    sum = num1 + num2;

    System.out.println("SUM: "+sum);

    sc.close();

  }
}
