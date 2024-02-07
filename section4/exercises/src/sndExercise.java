import java.util.Scanner;

public class sndExercise {

    public void secondExercise(){

    Scanner sc = new Scanner(System.in);

    double r, area;
    double pi = 3.14159;

    r = sc.nextDouble();

    area = Math.pow(r, 2) * pi;

    System.out.printf("Area: %.4f%n",area);

    sc.close();
  }

}
