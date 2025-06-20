package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
  }
  @Test
  void primeFactorsTest24() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(24), new ArrayList<Integer>(Arrays.asList(2, 2, 2, 3)));
  }
  @Test
  void primeFactorsTest510() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(510), new ArrayList<Integer>(Arrays.asList(2, 3, 5, 17)));
  }
  @Test
  void primeFactorsTest63() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(24), new ArrayList<Integer>(Arrays.asList(3, 3, 7)));
  }
  @Test
  void primeFactorsTest9699690() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(24), new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)));
  }
}
