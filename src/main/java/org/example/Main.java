package org.example;

import com.github.javafaker.Faker;

public class Main {
  public static void main(String[] args) {
    final Faker faker = new Faker();
    final String card = faker.finance().creditCard();
    System.out.println("card = " + card);
  }
}
