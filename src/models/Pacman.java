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
	
	public Pacman() {
		ImageLoader loader = ImageLoader.getImageLoaderInstance();
		pacmanImages = loader.getPacManImages();
	}

	public Image getGraphic(){
		return pacmanImages[0][1];
	}
}
