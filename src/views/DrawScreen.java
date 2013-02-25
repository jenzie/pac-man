package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawScreen extends JPanel{

	public void paint(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(640, 480);
	}
}
