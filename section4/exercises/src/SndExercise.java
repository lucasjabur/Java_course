import java.util.Scanner;

public class SndExercise {

    public void circleArea(){

    Scanner sc = new Scanner(System.in);

    double radius, area;
    double pi = 3.14159;

    radius = sc.nextDouble();

    area = Math.pow(radius, 2) * pi;

    System.out.printf("Area: %.4f%n",area);

    sc.close();
  }

}
