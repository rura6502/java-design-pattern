package io.github.rura6502.javadesignpattern.decorator.coffee;

class WhippedCream extends Decorator {

  public WhippedCream(Coffee coffee) {
    super(coffee);
  }

  public void brewing() {
    super.brewing();
    System.out.println("add whipped cream");
  }
}