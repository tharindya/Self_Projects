import java.security.SecureRandom;
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
public class DieRoll {
    private int sides;
    private SecureRandom random;

    public DieRoll() {
        random = new SecureRandom();
    }

    public void setSides(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides must be greater than zero");
        }
        this.sides = sides;
    }

    public int roll() {
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides not set or invalid");
        }
        return random.nextInt(sides) + 1; // Ensure 1 to sides inclusive
    }
}
