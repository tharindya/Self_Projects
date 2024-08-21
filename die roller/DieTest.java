import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* 
 * File name: DieTest.java
 * Author: Tharindya Anjalika
 * Date: 28/07/2024
 * purpose :
	• Swing components to build GUI application.
	• Event handlers to respond to user actions
	• good class construction including Javadoc & comments
 */
/**
 * @author anjad
 */
public class DieTest {

    private JFrame frame;
    private JTextField sideInput;
    private JTextField results;
    private DieRoll die;
    private DieController controller;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DieTest::new);
    }

    public DieTest() {
        frame = new JFrame("Electric Die");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        JLabel sidesLabel = new JLabel("# of sides:");
        sidesLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        sideInput = new JTextField();
        sideInput.setFont(new Font("Tahoma", Font.PLAIN, 24));

        JLabel resultLabel = new JLabel("Rolled:");
        resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        results = new JTextField();
        results.setFont(new Font("Tahoma", Font.PLAIN, 24));
        results.setEditable(false);

        JButton rollButton = new JButton("Roll the die");
        rollButton.setFont(new Font("Tahoma", Font.PLAIN, 24));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
		frame.setLayout(new BorderLayout());
		
        inputPanel.add(sidesLabel);
        inputPanel.add(sideInput);
        inputPanel.add(resultLabel);
        inputPanel.add(results);
        
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(rollButton, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

        die = new DieRoll();
        controller = new DieController(die, results);

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleRoll(sideInput.getText());
            }
        });
    }
}
