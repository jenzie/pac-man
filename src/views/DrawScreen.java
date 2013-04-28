/**
 * @author Jenny Zhen
 * date: 02.23.13
 * language: Java
 * file: DrawScreen.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package views;

import models.Pacman;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawScreen extends JPanel{

	private Pacman pacman;

	public DrawScreen(Pacman pacman){
		this.pacman = pacman;
	}

	public void paint(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.drawImage(pacman.getGraphic(), 0, 0, null);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(640, 480);
	}
}
