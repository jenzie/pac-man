/**
 * @author Jenny Zhen
 * date: 02.23.13
 * language: Java
 * file: PlayGUI.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package views;

import javax.swing.*;   // JButton, JFrame
import java.awt.*;  // BorderLayout, GridLayout, Container
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import models.Map;
import models.Pacman; // Pac-man model

/**
 * This is the interface for the player to actually play the game.
 */
public class PlayGUI extends JFrame implements KeyListener, ActionListener{
	private static final long serialVersionUID = 1L;
	private Pacman pacman; // pac-man instance
	private Map map;
	private JFrame frame; // the window
	private int currentDirection = 0;
	private DrawScreen screen;

	/**
	 * Constructor to create an instance of PlayGUI.
	 * @param pacman instance of Pacman
	 * @param map
	 */
	public PlayGUI(Pacman pacman, Map map) {
		this.pacman = pacman;
		this.map = map;
		createPlayGUI();
	}
	
	/**
	 * Creates the in-game interface.
	 */
	private void createPlayGUI() {
		//creates new window
		frame = new JFrame("Pac-man");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen = new DrawScreen(pacman, map);
		frame.add(screen);
		frame.addKeyListener(this);
		frame.pack();
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

	public void keyTyped(KeyEvent e){
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() > 36 && e.getKeyCode() < 41){
			currentDirection = e.getKeyCode() - 37;
			pacman.setDirection(currentDirection);
		}
	}

	public void keyReleased(KeyEvent e){
	}

	public void actionPerformed(ActionEvent e){
		screen.repaint();
	}
}
