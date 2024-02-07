public class frthExercise {

  private int number;
  private double hours;
  private double per_hour;

  public boolean setNumber(int number){
    if (number < 0)
      return false;
    else
      this.number = number;
      return true;
  }

  public int getNumber(){
    return number;
  }

  public void setHours(double hours){
    this.hours = hours;
  }

  public double getHours(){
    return hours;
  }

  public void setPerHour(double per_hour){
    this.per_hour = per_hour;
  }

  public double getPerHour(){
    return per_hour;
  }

  public double calcSalary(){
    return hours * per_hour;
  }
}
