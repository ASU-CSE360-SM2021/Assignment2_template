/*****
 * Template code that may help with the Facade/Observer section of assignment 2
*****/

public class NumberFacade {
  NumberArray allNumbers;
  NumberObserver observer;

  int positiveSum; // Sum of all the positive numbers added together
  /** TODO: Need to add more variables to store results from other functions **/

  public NumberFacade( NumberArray arg ) {

  }
  // Save the observer so you can notify it when you want to add new numbers to the arrays
  public setObserver( NumberObserver arg ) {
    observer = arg;
  }

  public void addNumbers() {
    // Add all the positive numbers together and save it to positiveSum
    
    observer.notifyObserver( NumberOperations.ADD_POSITIVE_NUMBERS, positiveSum );

    // Add all the negatives numbers together and save it
    
    observer.notifyObserver( NumberOperations.ADD_NEGATIVE_NUMBERS, negativeSum );
  }

  public void subtractNumbers() {
    // Subtract the original 5 positive numbers from 100
    
    observer.notifyObserver( ___ , _____ );

    // Subtract the original 5 negative numbers from 100
    
    observer.notifyObserver( ___, _____ );
  }
  
  public void multiplyNumbers() {
    // Multiply the original 5 positive numbers together
    
    observer.notifyObserver( ___, _____ );

    // Multiply the original 5 negative numbers together
    
    observer.notifyObserver( ___, _____ );
  }
}