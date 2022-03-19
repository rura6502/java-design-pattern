package io.github.rura6502.javadesignpattern.composite.product;

import java.util.ArrayList;
import java.util.Arrays;

public class Category extends ProductCategory {

  ArrayList<ProductCategory> list;

  public Category(String name) {
    super(name, 0);
    list = new ArrayList<>();
  }

  @Override
  public void add(ProductCategory productCategory) {
    list.add(productCategory);
  }

  @Override
  public void addAll(ProductCategory... productCategories) {
    list.addAll(Arrays.asList(productCategories));
  }

  @Override
  public void remove(ProductCategory productCategory) {
    for (ProductCategory pc : list) {
      if (pc.getName().equals(productCategory.getName())) {
        list.remove(pc);
        return;
      }
    }
    System.err.println("해당하는 상품이 목록에 없습니다.");
  }

  @Override
  public int getCount() {
    return list.stream()
        .mapToInt(ProductCategory::getCount)
        .sum();
  }

  @Override
  public int getPrice() {
    return list.stream()
        .mapToInt(ProductCategory::getPrice)
        .sum();
  }

  @Override
  public String getName() {
    return name;
  }
}
