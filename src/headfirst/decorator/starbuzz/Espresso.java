package headfirst.decorator.starbuzz;

public class Espresso extends Beverage {
  public Espresso() {
    description = "Esprosso";
  }
  public double cost() {
    return 1.99;
  }
}