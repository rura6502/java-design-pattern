package io.github.rura6502.javadesignpattern.decorator.coffee;

abstract class Decorator extends Coffee {

  Coffee coffee;

  public Decorator(Coffee coffee) {
    this.coffee = coffee;
  }

  public void brewing() {
    coffee.brewing();
  }
}