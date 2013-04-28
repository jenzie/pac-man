package models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author:      Grant Kurtz
 */
public class Game{

	private final Pacman pacman;
	private final Map map;
	private ActionListener listener;

	public Game(Pacman pacman, ActionListener listener){
		this.pacman = pacman;
		pacman.setPositionX(20);
		pacman.setPositionY(20);
		this.listener = listener;
		this.map = new Map();
	}

	public void run(){
		while(true){
			movePacman();
			listener.actionPerformed(new ActionEvent(this, 0, "repaint"));
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private void movePacman(){
		int newPositionX = 0, newPositionY = 0;
		int tileX = 0, tileY;
		switch(pacman.getDirection()){
			case 0:
				newPositionX = pacman.getPositionX() - 1;
				newPositionY = pacman.getPositionY();
				break;
			case 1:
				newPositionX = pacman.getPositionX();
				newPositionY = pacman.getPositionY() - 1;
				break;
			case 2:
				newPositionX = pacman.getPositionX() + 1;
				newPositionY = pacman.getPositionY();
				break;
			case 3:
				newPositionX = pacman.getPositionX();
				newPositionY = pacman.getPositionY() + 1;
				break;
		}

		tileX = map.resolveTile(newPositionX);
		if(pacman.getDirection() == 2)
			tileX++;
		tileY = map.resolveTile(newPositionY);
		if(pacman.getDirection() == 3)
					tileY++;
		if(map.isEmpty(tileX, tileY)){
			pacman.setPositionX(newPositionX);
			pacman.setPositionY(newPositionY);
		}
	}
}
