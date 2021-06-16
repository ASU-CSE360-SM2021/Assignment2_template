/*****
 * Template code that may help with the Facade/Observer section of assignment 2
*****/

public class NumberObserver {

  NumberArray allNumbers;

  public NumberObserver( NumberArray arg ) {

  }
  
  public void notifyObserver(NumberOperations op, int result) {
    if( op == NumberOperations.ADD_POSITIVE_NUMBERS ){
      // Add result to the positive number array
    } else if ( op == NumberOperations.ADD_NEGATIVE_NUMBERS ){
      // Add result to the negative number array
    }
  }

}