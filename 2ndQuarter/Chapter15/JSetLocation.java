import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSetLocation extends JFrame implements ActionListener
{
	JLabel greeting = new JLabel("Hello.  Who are you?");
	Font bigFont = new Font("TimesRoman", Font.ITALIC|Font.BOLD, 24);

	JButton pressMe = new JButton("Press Me");
	JButton pressMePlease = new JButton("No, Press Me");

	JLabel personalGreeting = new JLabel();

	JTextField answer = new JTextField(10);

	public JSetLocation()
	{
		super("Swing using set location");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane = new JPanel();
		setContentPane(pane);
		greeting.setFont(bigFont);

		pane.setLayout(null);


		pane.add(greeting);
		greeting.setSize(300,30);
		greeting.setLocation(80,8);

		pane.add(answer);
		answer.setSize(120,20);
		answer.setLocation(120,40);
		answer.setToolTipText("Enter your name");

		pane.add(pressMe);
		pressMe.setSize(90,35);
		pressMe.setLocation(85,100);

		pane.add(pressMePlease);
		pressMePlease.setSize(110,35);
		pressMePlease.setLocation(185,100);

		pane.add(personalGreeting);
		personalGreeting.setSize(250,15);
		personalGreeting.setLocation(10,250);

		answer.requestFocus();
		pressMe.addActionListener(this);
		pressMePlease.addActionListener(this);

		answer.setNextFocusableComponent(pressMe);
		pressMe.setNextFocusableComponent(pressMePlease);
	}

	public static void main(String[] args)
	{
		JFrame aFrame = new JSetLocation();
		aFrame.setSize(475,300);
		aFrame.setVisible(true);
	}
	public void actionPerformed(ActionEvent someEvent)
	{
		Object source = someEvent.getSource();
		if(source == pressMe)
		{
			String name = answer.getText();
			personalGreeting.setText("Thanks for picking me " + name);
			pressMe.setEnabled(false);
			pressMePlease.setEnabled(true);
		}
		else if(source == pressMePlease)
		{
			String name = answer.getText();
			personalGreeting.setText("No really, Thanks for picking me " + name);
			pressMe.setEnabled(true);
			pressMePlease.setEnabled(false);
		}
	}
}