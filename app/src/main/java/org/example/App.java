package org.example;

public class App {
  public static void main(String[] args) {
    // Test your Factorizer class using a driver program here!
    Factorizer factorizer = new Factorizer();
 
    System.out.println(factorizer.primeFactors(0)); // will return the ArrayList []
    System.out.println(factorizer.primeFactors(1)); // will return the ArrayList []
    System.out.println(factorizer.primeFactors(9)); // will return the ArrayList [3, 3]
    System.out.println(factorizer.primeFactors(10)); // will return the ArrayList [2, 5]

  }
}
