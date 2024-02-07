public class sxthExercise {

  private double A,B,C;

  public boolean setA(double A){
    if (A < 0)
      return false;
    else
      this.A = A;
      return true;
  }

  public double getA(){
    return A;
  }

  public boolean setB(double B){
    if (B < 0)
      return false;
    else
      this.B = B;
      return true;
  }

  public double getB(){
    return B;
  }

  public boolean setC(double C){
    if (C < 0)
      return false;
    else
      this.C = C;
      return true;
  }

  public double getC(){
    return C;
  }

  public double triangleArea(){
    return (A*C)/2;
  }

  public double circleArea(){
    return (C*C)*3.14159;
  }

  public double trapezoidArea(){
    return ((A+B)*C)/2;
  }

  public double squareArea(){
    return B*B;
  }

  public double rectangleArea(){
    return A*B;
  }

}
