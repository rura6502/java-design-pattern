package io.github.rura6502.javadesignpattern.adapter.print;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Banner {

  public void showBanner(String message) {
    System.out.println("Banner : " + message);
  }

}
