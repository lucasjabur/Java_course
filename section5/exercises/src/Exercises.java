public class Exercises {

  public boolean isNeg(double number){
    if (number < 0)
      return false;
    else 
      return true;
  }

  public boolean evenOrOdd(double number){
    if (number % 2 != 0)
      return false;
    else
      return true;
  }

  public boolean isMultiple(double numA, double numB){
    if (numA % numB != 0)
      return false;
    else
      return true;
  }

  public boolean validTime(int time){
    if (time > 23 || time < 0) return false;
    else return true;
  }

  public int matchDuration(int begin, int end){

    int temp, result;

    if (validTime(begin)){
      if (begin > end){
        temp = 24 - begin;
        result = temp + end;
        return result;
      }
      else if (end > begin){
        result = end - begin;
        return result;
      }
      else{
        result = 24;
        return result; 
      }
    }
    else{
      return 1;
    }
  }

  public double finalPrice(int code, int quantity){

    double result;

    switch (code) {
      case 1:
        result = 4 * quantity;
        return result;
      case 2:
        result = 4.5 * quantity;
        return result;
      case 3:
        result = 5 * quantity;
        return result;
      case 4:
        result = 2 * quantity;
        return result;
      case 5:
        result = 1.5 * quantity;
        return result;
      default:
        System.err.println("Error!");
        return 1.0;
    }
  }

  public void whereIsIt(double number){
    if (number >= 0 && number <= 25){
      System.out.println("Inside [0,25]");
    }
    else if (number > 25 && number <= 50){
      System.out.println("Inside (25,50]");
    }
    else if (number < 50 && number >= 75){
      System.out.println("Inside (50,75]");
    }
    else if (number < 75 && number >= 100){
      System.out.println("Inside (75,100]");
    }
    else{
      System.out.println("Outside of any intervals!");
    }
  }

  public void dotLocation(double fstValue, double sndValue){
    if (fstValue == 0.0 && sndValue == 0.0){
      System.out.println("Origem");
    }
    else if (fstValue == 0.0 && sndValue != 0.0){
      System.out.println("Y Axis");
    }
    else if (fstValue != 0.0 && sndValue == 0.0){
      System.out.println("X Axis");
    }
    else if (fstValue > 0 && sndValue > 0){
      System.out.println("Q1");
    }
    else if (fstValue < 0 && sndValue > 0){
      System.out.println("Q2");
    }
    else if (fstValue < 0 && sndValue < 0){
      System.out.println("Q3");
    }
    else{
      System.out.println("Q4");
    }
  }

  public boolean validSalary(double salary){
    if (salary > 0) return true;
    else return false;
  }

  public void taxCalc(double salary){

    double result;

    if (salary <= 2000.0){
      result = 0.0;
      System.out.println("Free of taxes");
    }
    else if (salary <= 3000.0){
      result = (salary - 2000.0) * 0.08;
    }
    else if (salary <= 4500.0){
      result = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
    }
    else{
      result = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
    }

    if (result > 0.0){
      System.out.println("Taxes: R$ "+result);
    }

  }

}
