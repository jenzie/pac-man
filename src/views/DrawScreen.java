/**
 * @author Jenny Zhen
 * date: 02.23.13
 * language: Java
 * file: DrawScreen.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package views;

import models.Map;
import models.Pacman;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import static models.Map.Tile.WALL;

public class DrawScreen extends JPanel{

	private Pacman pacman;
	private Map map;

	public DrawScreen(Pacman pacman, Map map){
		this.pacman = pacman;
		this.map = map;
	}

	public void paint(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);

		// Draw Border
		g.setColor(Color.BLUE);
		for(int i = 0; i < 32; i++){
			for(int k = 0; k < 24; k++){
				switch(map.getMap()[i][k]){
					case WALL:
						g.drawRoundRect(20 * i, 20 * k, 20, 20, 5, 5);
						break;
				}
			}
		}

		// Draw Pacman
		g.drawImage(pacman.getGraphic(), pacman.getPositionX() + 5,
					pacman.getPositionY() + 5, null);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(641, 481);
	}
}
