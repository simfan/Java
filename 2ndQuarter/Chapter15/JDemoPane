import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDemoPane extends JFrame implements ActionListener
{
	JButton b1 = new JButton("First");
	JButton b2 = new JButton("Second");
	JButton b3 = new JButton("Third");

	public JDemoPane()
	{
		super("Panel with Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		setContentPane(pane);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public static void main(String[] args)
	{
		JFrame aFrame = new JDemoPane();
		aFrame.setSize(475,300);
		aFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source==b1)
			b1.setText("Event Handlers Incorporated");
		else if(source==b2)
			b2.setText("Plan With Us");
		else if(source==b3)
			b3.setText("You just relax.  We'll manage the party.");
	}
}