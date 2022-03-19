package io.github.rura6502.javadesignpattern.adapter.print;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Popup {

  public void showPopup(String message) {
    System.out.println("View : " + message);
  }

}
