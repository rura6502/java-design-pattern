package io.github.rura6502.javadesignpattern.composite.product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ClientTest {

  @Test
  void test() {

    ProductCategory manCategory = new Category("Man");

    ProductCategory manShirt = new Category("Man Shirt");
    ProductCategory manShirtA = new Product("Man Shirt A", 1000);
    ProductCategory manShirtB = new Product("Man Shirt B", 2000);
    ProductCategory manPants = new Category("Man Pants");
    ProductCategory manPantsA = new Product("Man Pants A", 3000);
    ProductCategory manPantsB = new Product("Man Pants B", 4000);
    ProductCategory manShoes = new Category("Man Shoes");
    ProductCategory manShoesA = new Category("Man Shoes A");
    ProductCategory manShoesA_a = new Product("Man Shoes A_a", 7000);
    ProductCategory manShoesA_b = new Product("Man Shoes A_b", 8000);
    ProductCategory manShoesB = new Product("Man Shoes B", 5000);
    ProductCategory manShoesC = new Product("Man Shoes C", 6000);

    ProductCategory womanCategory = new Category("Woman");
    ProductCategory womanShirt = new Category("Woman Shirt");
    ProductCategory womanPants = new Category("Woman Pants");
    ProductCategory womanShoes = new Category("Woman Shoes");

    manCategory.addAll(manShirt, manPants, manShoes);
    manShirt.addAll(manShirtA, manShirtB);
    manPants.addAll(manPantsA, manPantsB);
    manShoes.addAll(manShoesA, manShoesB, manShoesC);
    manShoesA.addAll(manShoesA_a, manShoesA_b);

    womanCategory.addAll(womanShirt, womanPants, womanShoes);

    assertThat(manCategory.getCount()).isEqualTo(8);
    assertThat(manCategory.getPrice()).isEqualTo(36000);
  }
}
