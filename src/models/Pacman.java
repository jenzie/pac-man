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
	
	public Pacman() {
		ImageLoader loader = ImageLoader.getImageLoaderInstance();
		pacmanImages = loader.getPacManImages();
	}

	public Image getGraphic(){
		return pacmanImages[0][1];
	}
}
