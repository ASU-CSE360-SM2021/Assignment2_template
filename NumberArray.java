/**
 * <your name here>
 * CSE 360: Assignment 2
 * Template file for starting the assignnment
 */
import java.util.Vector;

public class NumberArray {
  public int[] positiveNumbers;
  public int[] negativeNumbers;

  public NumberArray() {
    positiveNumbers = new int[8];
    negativeNumbers = new int[8];

    for( int i = 0; i < 5; ++i ) {
      positiveNumbers[i] = ((int)(Math.random() * 10));
      negativeNumbers[i] = -1 * ((int)(Math.random() * 10));
    } 
  }
}
