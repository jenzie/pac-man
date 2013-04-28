/**
 * @author Jenny Zhen
 * date: 02.23.12
 * language: Java
 * file: Pacman.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package models;

import java.awt.*;
import java.util.ArrayList;

public class Pacman {

	private Image[][] pacmanImages;
	private int direction;
	private int positionX, positionY;

	public Pacman() {
		ImageLoader loader = ImageLoader.getImageLoaderInstance();
		pacmanImages = loader.getPacManImages();
	}

	public Image getGraphic(){
		return pacmanImages[0][1];
	}

	public void setDirection(int direction){
		this.direction = direction;
	}

	public int getPositionX(){
		return positionX;
	}

	public void setPositionX(int positionX){
		this.positionX = positionX;
	}

	public int getPositionY(){
		return positionY;
	}

	public void setPositionY(int positionY){
		this.positionY = positionY;
	}

	public int getDirection(){
		return direction;
	}
}
