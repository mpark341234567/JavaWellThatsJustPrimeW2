package org.example;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;



public class Factorizer {
  private ArrayList<Integer> PrimeDivsors = new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19));
  // private ArrayList<Integer>  = new ArrayList<>();
  public ArrayList<Integer> primeFactors(Integer n) {
    // Implement your code here!
    ArrayList<Integer> factors = new ArrayList<>();
    doesItDivide(n, factors);
    // Your factorization logic should go here, for now just return an empty list
    return factors;
  }
  private void doesItDivide(Integer n, ArrayList<Integer> factors) {
    if (n <= 1) {
      return;
    }
    for (Integer prime : PrimeDivsors) {
      if (n % prime == 0) {
        factors.add(prime);
        n /= prime;
        doesItDivide(n, factors);
        return; 
      }
    }
  }
}
