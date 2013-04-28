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
