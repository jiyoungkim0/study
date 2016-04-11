package com.j1.w5;

public class Mocha extends CondimentDecorator {
  Beverage beverage; //�̰� �� �ϴ°�¡..?//
  
  public Mocha(Beverage beverage){
    this.beverage = beverage; //.this �����ϱ�//
  }
  
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
  
  public double cost() {
    return .20 + beverage.cost();
  }
}