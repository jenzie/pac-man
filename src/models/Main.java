/**
 * @author Jenny Zhen
 * date: 02.23.13
 * language: Java
 * file: Main.java
 * project: Pac-man
 *          Implementation of the classic Pac-Man game in Java.
 */

package models;

import views.*;

public class Main {
	public static void main(String[] args){
		Pacman pacman = new Pacman();
		PlayGUI play = new PlayGUI(pacman);
		Game game = new Game(pacman, play);
		game.run();
	}
}
