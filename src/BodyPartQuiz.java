import java.awt.Frame;

import java.util.ArrayList;

import java.util.Iterator;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	//
	String firstImage = "C:/Users/Win/Desktop/leblanc.jpg";

	String secondImage = "C:/Users/Win/Desktop/good-wife.jpg";

	String thirdImage = "C:/Users/Win/Desktop/beckham.jpg";

	Frame window = new Frame();

	private void startQuiz() {

		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(100, 100);

		// Make an int variable to hold the score.
		int score = 0;

		// Ask the user who this person is and store their answer
		String person = JOptionPane.showInputDialog("Who is this?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		if (person.equals("Matt")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		}

		// Otherwise:
		// -- Tell them they are wrong
		else {
			JOptionPane.showMessageDialog(null, "No, it's Matt Le Blanc");
		}

		// Use the method below to show the next image

		// Show the score
		JOptionPane.showMessageDialog(null, "You have " + score + " out of 1");
		// .... repeat for all your images.....
		showNextImage();
		window.setSize(200, 800);
		person = JOptionPane.showInputDialog("Who is this?");
		if (person.equals("Good")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		}

		// Otherwise:
		// -- Tell them they are wrong
		else {
			JOptionPane.showMessageDialog(null, "No, it's the Good Wife");
		}

		// Use the method below to show the next image

		// Show the score
		JOptionPane.showMessageDialog(null, "You have " + score + " out of 2");
		// .... repeat for all your images.....
		showNextImage();
		window.setSize(200, 200);
		person = JOptionPane.showInputDialog("Who is this?");
		if (person.equals("David")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;
		}

		// Otherwise:
		// -- Tell them they are wrong
		else {
			JOptionPane.showMessageDialog(null, "No, it's David Beckham");
		}

		// Use the method below to show the next image

		// Show the score
		JOptionPane.showMessageDialog(null, "You have " + score + " out of 3");
	}

	public void showNextImage() {

		window.removeAll();

		window.add(getNextImage());

		window.pack();

	}

	public static void main(String[] args) {

		BodyPartQuiz quiz = new BodyPartQuiz();

		quiz.initializeGui();

		quiz.startQuiz();

	}

	private void initializeGui() {

		initializeImageList();

		imageIterator = imageList.iterator();

		window.setVisible(true);

		showNextImage();

	}

	private JLabel loadImage(String fileName) {

		Icon icon = new ImageIcon(fileName);

		JLabel image = new JLabel(icon);

		return image;

	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();

	Iterator<JLabel> imageIterator;

	private void initializeImageList() {

		JLabel imageLabel = loadImage(firstImage);

		imageList.add(imageLabel);

		imageLabel = loadImage(secondImage);

		imageList.add(imageLabel);

		imageLabel = loadImage(thirdImage);

		imageList.add(imageLabel);

	}

	private JLabel getNextImage() {

		if (imageIterator.hasNext())

			return imageIterator.next();

		window.dispose();

		return new JLabel();

	}

}
