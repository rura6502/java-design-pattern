package io.github.rura6502.javadesignpattern.decorator.coffee;

import org.junit.jupiter.api.Test;

class ClientTest {

  @Test
  void test() {

    Coffee ethiopiaCoffeeWithMilk = new Milk(new EthiopiaCoffee());
    ethiopiaCoffeeWithMilk.brewing();

    System.out.println();
    System.out.println("------------------------------");
    System.out.println();

    Coffee kenyaCoffeeWithWhippedCreamAndMilk
        = new WhippedCream(new Milk(new KenyaCoffee()));
    kenyaCoffeeWithWhippedCreamAndMilk.brewing();
  }
}
