public class App {
  public static void main(String[] args) throws Exception {
      
    Exercises value = new Exercises();
    
    boolean posNeg = value.isNeg(8);
    if (posNeg){
      System.out.println("Not negative number");
    }
    else{
      System.out.println("Negative number");
    }

    boolean evenOdd = value.evenOrOdd(3);
    if (evenOdd){
      System.out.println("Even number");
    }
    else{
      System.out.println("Odd number");
    }
    
    boolean isMult = value.isMultiple(63, 21);
    if (isMult){
      System.out.println("The numbers are multiples");
    }
    else{
      System.out.println("The number are not multiples");
    }

    int matchDur = value.matchDuration(16, 2);
    if (matchDur == 1){
      System.err.println("Error!");
    }
    else{
      System.out.println("Match duration: "+matchDur);
    }

    double price = value.finalPrice(2, 5);
    System.out.println("Price: "+price);

    value.whereIsIt(25.65);

    value.dotLocation(0, 5.4);

    value.taxCalc(3002);
  }
}
