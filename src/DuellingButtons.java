import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {

    public static void main(String[] args) {
        new DuellingButtons().createUI();
    }

    JButton leftButton = new JButton();
    JButton rightButton = new JButton();

    Dimension BIG = new Dimension(600,600);
    Dimension SMALL = new Dimension(100,100);

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    private void createUI() {
        // 1. Add the panel to the frame
frame.add(panel);
        // 2. Make the frame visible
frame.setVisible(true);
        // 3. Set the text of the leftButton to "Click me!"
leftButton.setText("Click me!");
        // 4. Set the text of the rightButton to "Click me!"
rightButton.setText("Click me!");
        // 5. Add an action listener to the leftButton
leftButton.addActionListener(this);
        // 6. Add an action listener to the rightButton
rightButton.addActionListener(this);
        // 7. Add the leftButton to the panel
panel.add(leftButton);
        // 8. Add the rightButton to the panel
panel.add(rightButton);
        // 9. Pack the frame
frame.pack();
        // 10. Set the title of the frame to "Demanding Buttons"
frame.setTitle("Demanding Buttons");
    }

    @Override

    public void actionPerformed(ActionEvent arg0) {
        JButton buttonPressed = (JButton) arg0.getSource();

        /* If the buttonPressed was the leftButton....*/
if (buttonPressed == leftButton)
{
	System.out.println("Left Button");
	rightButton.setText("No, Click me!");
	rightButton.setPreferredSize(BIG);
	leftButton.setText("Click me!");
	leftButton.setPreferredSize(SMALL);
	
}
else if (buttonPressed == rightButton)
{
	leftButton.setText("No, Click me!");
	leftButton.setPreferredSize(BIG);
	rightButton.setText("Click me!");
	rightButton.setPreferredSize(SMALL);
	
}
            // Set the text of the rightButton to "No, click Me!"
            // Set the preferred size of the rightButton to BIG
            // Set the text of the leftButton to "Click Me!"
            // Set the preferred size of the leftButton to SMALL
     /* If the buttonPressed was the rightButton, do the opposite. */

        frame.pack();
    }

}

