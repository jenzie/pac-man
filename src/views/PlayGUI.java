/**
 * @author Jenny Zhen
 * date: 02.23.12
 * language: Java
 * file: PlayGUI.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package views;

import javax.swing.*;   // JButton, JFrame
import java.awt.*;  // BorderLayout, GridLayout, Container

import models.Pacman; // Pac-man model

/**
 * This is the interface for the player to actually play the game.
 */
public class PlayGUI extends JFrame{
	private static final long serialVersionUID = 1L;
	private Pacman pacman; // pac-man instance
	private JFrame frame; // the window

	/**
	 * Constructor to create an instance of PlayGUI.
	 * @param pacman instance of Pacman
	 */
	public PlayGUI(Pacman pacman) {
		this.pacman = pacman;
		createPlayGUI();
	}
	
	/**
	 * Creates the in-game interface.
	 */
	private void createPlayGUI() {
		//creates new window
		frame = new JFrame("Pac-man");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setFrameSize(280, 280);
		
		
	}
	
	/**
	 * Sets the window size as needed.
	 * @param width - width of new size
	 * @param height - height of new size
	 */
	private void setFrameSize(int width, int height) {
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
	}
}
