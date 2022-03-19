package io.github.rura6502.javadesignpattern.composite.product;

public class Product extends ProductCategory {

  public Product(String name, int price) {
    super(name, price);
  }

  @Override
  public void add(ProductCategory productCategory) {
  }

  @Override
  public void addAll(ProductCategory... productCategory) {
  }

  @Override
  public void remove(ProductCategory productCategory) {
  }

  @Override
  public int getCount() {
    return 1;
  }

  @Override
  public int getPrice() {
    return price;
  }

  @Override
  public String getName() {
    return name;
  }
}
