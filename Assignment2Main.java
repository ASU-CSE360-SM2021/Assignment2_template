/**
 * <your name here>
 * CSE 360: Assignment 2
 * Template file for starting the assignment
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    /*****
     * Generate 10 random numbers
     * 5 of the numbers are between [0, 10)
     * 5 of the numbers are between (-10, 0]
    *****/
    NumberArray arr = new NumberArray();

    /***** Create JFrame *****/
    JFrame frame = new JFrame();
    frame.setSize(400, 500);
    frame.setLayout(new GridLayout(1,1));

    /***** Add tabs to the frame *****/
    JTabbedPane tabs = new JTabbedPane();
    String[] columnNames = {"Positive Numbers", "Negative Numbers"};

    /***** Panel for iterator design pattern *****/
    /***
     * TODO: Create a NumberIterator class to go through arr to create an Object[][]
     * that you can insert into the JTable constructor below
     */
    JTable iteratorTable = new JTable(3, 2);

    JScrollPane iteratorPanel = new JScrollPane(iteratorTable);
    iteratorTable.setFillsViewportHeight(true);
    
    tabs.addTab("Iterator", iteratorPanel);

    /***** Panel for facade design pattern *****/
    JPanel facadePanel = new JPanel();
    String sampleText = "Add all positive numbers:" + arr.positiveNumbers[1];
    JLabel text1 = new JLabel(sampleText);
    JLabel text2 = new JLabel("Add all negatvie numbers: something" );
    facadePanel.add(text1);
    facadePanel.add(text2);
    
    tabs.addTab("Facade", facadePanel);

    /***** Panel for observer design pattern *****/
    JTable observerTable = new JTable(3, 2);

    JScrollPane observerPanel = new JScrollPane(observerTable);
    observerTable.setFillsViewportHeight(true);
    
    tabs.addTab("Observer", observerPanel);

    /***** Panel for decorator design pattern *****/
    JTable decoratorTable1 = new JTable(3, 2);
    JTable decoratorTable2 = new JTable(3, 2);
    JTable decoratorTable3 = new JTable(3, 2);

    JPanel allTables = new JPanel(new GridLayout(6, 1));
    allTables.add(new JLabel("AddOp's table"));
    allTables.add(decoratorTable1);
    allTables.add(new JLabel("SubtractOp's table"));
    allTables.add(decoratorTable2);
    allTables.add(new JLabel("MuliplierOp's table"));
    allTables.add(decoratorTable3);
    JScrollPane decoratorPanel = new JScrollPane(allTables);

    tabs.addTab("Decorator", decoratorPanel);

    frame.add(tabs, BorderLayout.CENTER);
    frame.setVisible(true);
  }
}
