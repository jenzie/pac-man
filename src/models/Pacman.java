/**
 * @author Jenny Zhen
 * date: 02.23.13
 * language: Java
 * file: Pacman.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package models;

import views.ImageLoader;

import java.awt.*;

public class Pacman {

	private Image[][] pacmanImages;
	private int direction;
	private int positionX, positionY;
	private int curFace = 0;
	private int delay = 0;

	public Pacman() {
		ImageLoader loader = ImageLoader.getImageLoaderInstance();
		pacmanImages = loader.getPacManImages();
	}

	public Image getGraphic(){
		if(delay > 10){
			delay = 0;
			curFace = (curFace + 1) % 2;
		}
		return pacmanImages[direction][curFace];
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

	public void addDelay(){
		delay++;
	}
}
