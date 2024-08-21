import javax.swing.*;
/* 
 * File name: DieTest.java
 * Author: Tharindya Anjalika
 * Course: CST8132 – OOP
 * Assignment: 3
 * Date: 28/07/2024
 * Professor: Islam Gomaa
 * purpose :
	• Swing components to build GUI application.
	• Event handlers to respond to user actions
	• good class construction including Javadoc & comments
 */
/**
 * @author anjad
 */
public class DieController {
    private DieRoll die;
    private JTextField resultDisplay;

    public DieController(DieRoll die, JTextField resultDisplay) {
        this.die = die;
        this.resultDisplay = resultDisplay;
    }

    public void handleRoll(String sidesText) {
        try {
            int sides = Integer.parseInt(sidesText);
            die.setSides(sides);
            int result = die.roll();
            resultDisplay.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
