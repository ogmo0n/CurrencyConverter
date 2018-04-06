// CurrencyConverterFrame.java

import java.awt.*;
import javax.swing.*;

public class CurrencyConverterFrame extends JFrame 
{
   private final JLabel label1; // first label
   private final JTextField textField1; // text field 
   private final JLabel label2; // second label
   private final JTextField textField2; // text field
   private final JLabel label3; // third label
   private final JTextField textField3; // text field
   private final JButton convertButton;
   private final JButton exitButton;
   private final GridLayout layout;
   private final String conversionRate = "0.0125";
   
   // TextFieldFrame constructor adds JTextFields to JFrame
   public CurrencyConverterFrame()
   {
      super("Currency Converter");
      layout = new GridLayout(4, 1, 1, 4);
      setLayout(layout);
      
      // construct label
      label1 = new JLabel("Dollars: ", SwingConstants.RIGHT); 
      add(label1); // add textField1 to JFrame
      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
      add(textField1); // add textField1 to JFrame

      // construct label
      label2 = new JLabel("Conversion Rate: ", SwingConstants.RIGHT); 
      add(label2); // add textField1 to JFrame
      // construct textfield 
      textField2 = new JTextField(conversionRate, 10); 
      textField2.setEditable(false);
      add(textField2); // add textField1 to JFrame

      // construct label
      label3 = new JLabel("Dracs: ", SwingConstants.RIGHT); 
      add(label3); // add textField1 to JFrame
      // construct textfield 
      textField3 = new JTextField(10); 
      add(textField3); // add textField1 to JFrame
      
      // construct buttons
      convertButton = new JButton("Convert");
      add(convertButton);
      // add lambda event handler for output/arithmetic
      convertButton.addActionListener(e -> {
		  double rate = Double.parseDouble(conversionRate);
		  double dollars = Double.parseDouble(textField1.getText());
		  double dracs = rate * dollars;
		  textField3.setText(String.format("%.4f", dracs));  
      }); 
      exitButton = new JButton("Exit"); 
      add(exitButton);
      // add lambda event handler to close
      exitButton.addActionListener(e -> {
    	  System.exit(0);
      });
   } // end constructor
} // end class