package io.github.rura6502.javadesignpattern.adapter.print;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintToBannerAdaptor implements Print {

  private Banner banner;

  public void print() {
    banner.showBanner(message);
  }
}
