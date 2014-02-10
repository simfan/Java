/* Chris Glock
 * 1/30/2006
 * AppletExercise
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletExercise extends JApplet implements ActionListener
{
	private JComboBox genreBox, dateBox, movieBox, timeBox;
	private JLabel movieLabel, genreList, dateList, movieList, timeList, imageLabel;
	private JTextArea results;
	private JButton search;
	String[] genres = {"action", "comedy", "drama", "horror", "kids", "musical", "romance", "science fiction", "thriller", "western"};
	String[] dates = {"01/27/2006", "01/28/2006", "01/29/2006", "01/30/2006", "01/31/2006", "02/01/2006", "02/02/2006", "02/03/2006", "02/04/2006", "02/05/2006"};
	String[] movies = {"Ace Ventura, Pet Detective", "Cheaper by the Dozen", "Dukes of Hazzard", "Hook", "Hoodwinked", "Home Alone", "Jumanji", "Madagascar", "Mrs.Doubtfire", "Star Wars Episode III"};
	String[] times = {"12:00 p.m.", "2:00 p.m.", "4:00 p.m.", "6:00 p.m.", "8:00 p.m.", "10:00 p.m."};
	Font movieFont =new Font("Broadway", Font.ITALIC, 20);

	ImageIcon ufo;
	AudioClip sound;
	public void init()
	{
		ufo = new ImageIcon("ufo.gif");
		sound = getAudioClip(getCodeBase(), "20th_century_fox.au");
		JPanel pane = new JPanel();
		setContentPane(pane);
		pane.setBackground(Color.blue);
		pane.setLayout(null);

		results = new JTextArea();

		movieLabel = new JLabel("Milford Movie Theater");
		movieLabel.setFont(movieFont);
		movieLabel.setSize(250,30);
		movieLabel.setLocation(75,1);
		pane.add(movieLabel);

		genreList = new JLabel("Genre:");
		genreList.setSize(50,20);
		genreList.setLocation(20,30);
		pane.add(genreList);

		genreBox = new JComboBox(genres);
		genreBox.setSize(125,20);
		genreBox.setLocation(140,30);
		pane.add(genreBox);

		dateList = new JLabel("Date:");
		dateList.setSize(50,20);
		dateList.setLocation(20,60);
		pane.add(dateList);

		dateBox = new JComboBox(dates);
		dateBox.setSize(105,20);
		dateBox.setLocation(160,60);
		pane.add(dateBox);

		movieList = new JLabel("Movie:");
		movieList.setSize(50,20);
		movieList.setLocation(20,90);
		pane.add(movieList);

		movieBox = new JComboBox(movies);
		movieBox.setSize(200,20);
		movieBox.setLocation(65,90);
		pane.add(movieBox);

		timeList = new JLabel("Time:");
		timeList.setSize(50,20);
		timeList.setLocation(20,120);
		pane.add(timeList);

		timeBox = new JComboBox(times);
		timeBox.setSize(105,20);
		timeBox.setLocation(160,120);
		pane.add(timeBox);

		imageLabel = new JLabel(ufo);
		imageLabel.setSize(150,100);
		imageLabel.setLocation(250,30);
		pane.add(imageLabel);

		search = new JButton("Search");
		search.setSize(100,20);
		search.setLocation(275,120);
		search.addActionListener(this);
		pane.add(search);

		results.setSize(355,125);
		results.setLocation(20,150);
		pane.add(results);

	}

	public void actionPerformed(ActionEvent event)
	{
		String genre = (String)genreBox.getSelectedItem();
		String date = (String)dateBox.getSelectedItem();
		String movie = (String)movieBox.getSelectedItem();
		String time = (String)timeBox.getSelectedItem();

		results.append("Genre:  " + genre + "\tDate:  " + date + "\n" + "Movie:  " +movie + "  Time:  " + time + "\n\n");
	}

	public void start()
	{
		sound.loop();
	}

	public void stop()
	{
		sound.stop();
	}
}
