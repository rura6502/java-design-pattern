package io.github.rura6502.javadesignpattern.adapter.print;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintToPopupAdaptor implements Print {

  private Popup popup;

  public void print() {
    popup.showPopup(message);
  }
}
