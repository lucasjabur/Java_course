import java.util.Scanner;

public class ThdExercise {

    public void difProducts(){
    
    Scanner sc = new Scanner(System.in);

    int varA, varB, varC, varD, dif;

    varA = sc.nextInt();
    varB = sc.nextInt();
    varC = sc.nextInt();
    varD = sc.nextInt();

    dif = (varA * varB) - (varC * varD);

    System.out.println("DIFFERENCE: " + dif);

    sc.close();
  }

}
