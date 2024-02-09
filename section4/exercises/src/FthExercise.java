public class FthExercise {

  private int code1, code2;
  private int quantity1, quantity2;
  private double price1, price2;

  public boolean setFstCode(int code1){
    if (code1 < 0)
      return false;
    else
      this.code1 = code1;
      return true;
  }

  public int getFstCode(){
    return code1;
  }

  public boolean setSndCode(int code2){
    if (code2 < 0)
      return false;
    else
      this.code2 = code2;
      return true;
  }

  public int getSndCode(){
    return code2;
  }

  public boolean setFstQnt(int quantity1){
    if (quantity1 < 0)
      return false;
    else
      this.quantity1 = quantity1;
      return true;
  }

  public int getFstQnt(){
    return quantity1;
  }

  public boolean setSndQnt(int quantity2){
    if (quantity2 < 0)
      return false;
    else
      this.quantity2 = quantity2;
      return true;
  }

  public int getSndQnt(){
    return quantity2;
  }

  public void setFstPrice(int price1){
    this.price1 = price1;
  }

  public double getFstPrice(){
    return price1;
  }

  public void setSndPrice(int price2){
    this.price2 = price2;
  }

  public double getSndPrice(){
    return price2;
  }

  public double totalPrice(){
    return (quantity1*price1)+(quantity2*price2);
  }

}
