
/* Filename: TimeChangeCalculator *
* Created by: Robert Mulligan*
* Created on: 10/09/2014 *
* Last Modified by: Robert Mulligan *
* Last Modified on: 10/11/2014  *
*/

/* This program takes two numbers 
* Then, performans calculations between the two numbers
 */ 

import javax.swing.JOptionPane;
import java.io.*;

public class TimeChangeCalculator {
        public static void main( String[] args) {
         
        int One = Integer.parseInt(JOptionPane.showInputDialog("Integer one please:").trim());
        int Two = Integer.parseInt(JOptionPane.showInputDialog("Integer two please:").trim());  

          
        System.out.println( "Addition: " + ( One + Two ));
        System.out.println( "Subtraction: " + ( One - Two ));
        System.out.println( "Product: " + ( One * Two ));
        System.out.println( "Average: " + ( ( One + Two) * 0.5 ));
        System.out.println( "Distance:" + ( Math.abs( One - Two)));

        float  max = ((( One + Two) + Math.abs( One - Two)) / 2);
        System.out.printf( "Maximum: %.0f\n", max);

        float  min = ((( One + Two) - Math.abs( One - Two)) / 2);
        System.out.printf( "Minimum: %.0f\n", + min);
          }
}




