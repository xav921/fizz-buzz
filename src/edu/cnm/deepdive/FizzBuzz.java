package edu.cnm.deepdive;

public class FizzBuzz {

  private static final int DEFAULT_UPPER_BOUND = 100;

  public static void main(String[] args) {
    int upperBound = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_BOUND;
    for (int i = 1; i <= upperBound; i++) {
      System.out.println(fizzBuzzValue(i));
    }
  }

  public static String fizzBuzzValue(int value) {
    String fb = "";
    if (value % 3 == 0) {
      fb += "Fizz";
    }
    if (value % 5 == 0) {
      fb = Integer.toString(value);
    }
    return fb;


  }
}
