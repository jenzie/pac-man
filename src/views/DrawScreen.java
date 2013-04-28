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

		// Draw Border
		g.setColor(Color.BLUE);
		g.drawRoundRect(2, 2, 636, 476, 10, 10);
		g.drawRoundRect(6, 6, 628, 468, 10, 10);

		// Draw Pacman
		g.drawImage(pacman.getGraphic(), pacman.getPositionX(),
					pacman.getPositionY(), null);
		System.out.println(pacman.getPositionX() + " " + pacman.getPositionY());
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(641, 481);
	}
}
