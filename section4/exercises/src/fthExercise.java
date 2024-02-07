public class fthExercise {

  private int code1, code2;
  private int quantity1, quantity2;
  private double price1, price2;

  public boolean setCode1(int code1){
    if (code1 < 0)
      return false;
    else
      this.code1 = code1;
      return true;
  }

  public int getCode1(){
    return code1;
  }

  public boolean setCode2(int code2){
    if (code2 < 0)
      return false;
    else
      this.code2 = code2;
      return true;
  }

  public int getCode2(){
    return code2;
  }

  public boolean setQnt1(int quantity1){
    if (quantity1 < 0)
      return false;
    else
      this.quantity1 = quantity1;
      return true;
  }

  public int getQnt1(){
    return quantity1;
  }

  public boolean setQnt2(int quantity2){
    if (quantity2 < 0)
      return false;
    else
      this.quantity2 = quantity2;
      return true;
  }

  public int getQnt2(){
    return quantity2;
  }

  public void setPrice1(int price1){
    this.price1 = price1;
  }

  public double getPrice1(){
    return price1;
  }

  public void setPrice2(int price2){
    this.price2 = price2;
  }

  public double getPrice2(){
    return price2;
  }

  public double totalPrice(){
    return (quantity1*price1)+(quantity2*price2);
  }

}
