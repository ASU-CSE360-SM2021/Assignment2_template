public class NumberIterator {
  NumberArray iteratorList;
  int index;

  public NumberIterator( NumberArray arg ) {
    
  }

  public boolean hasNext() {

  }

  /*****
   * Move through the NumberArray to create an Object[][] for the JTable in main()
  *****/
  public Object[][] createTableData() {
    Object[][] tableData = new Object[8][2];

    while( hasNext() ) {
      // Put the postive and negative numbers into tableData
    }

    return tableData;
  }

}