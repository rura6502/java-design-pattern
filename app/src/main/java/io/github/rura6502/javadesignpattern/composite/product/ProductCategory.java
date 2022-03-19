package io.github.rura6502.javadesignpattern.composite.product;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ProductCategory {

  String name;

  int price;

  public abstract void add(ProductCategory productCategory);

  public abstract void addAll(ProductCategory... productCategory);

  public abstract void remove(ProductCategory productCategory);

  public abstract int getCount();

  public abstract int getPrice();

  public abstract String getName();

}
