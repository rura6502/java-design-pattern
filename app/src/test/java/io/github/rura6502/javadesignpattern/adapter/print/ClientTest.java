package io.github.rura6502.javadesignpattern.adapter.print;

import org.junit.jupiter.api.Test;

public class ClientTest {

  @Test
  void test() {

    Banner banner = new Banner();
    Print printToBannerAdaptor = new PrintToBannerAdaptor(banner);
    printToBannerAdaptor.print();

    Popup popup = new Popup();
    Print printToPopupAdaptor = new PrintToPopupAdaptor(popup);
    printToPopupAdaptor.print();


  }

}
