package io.github.rura6502.javadesignpattern.decorator.coffee;

class Milk extends Decorator {

  public Milk(Coffee coffee) {
    super(coffee);
  }

  public void brewing() {
    super.brewing();
    System.out.println("add milk");
  }
}