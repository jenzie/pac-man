package models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Author:      Grant Kurtz
 */
public class Game{

	private final Pacman pacman;
	private ActionListener listener;

	public Game(Pacman pacman, ActionListener listener){
		this.pacman = pacman;
		this.listener = listener;
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
		switch(pacman.getDirection()){
			case 0:
				if(pacman.getPositionX() > 0){
					pacman.setPositionX(pacman.getPositionX() - 1);
				}
				break;
			case 1:
				if(pacman.getPositionY() > 0){
					pacman.setPositionY(pacman.getPositionY() - 1);
				}
				break;
			case 2:
				if(pacman.getPositionX() < 625){
					pacman.setPositionX(pacman.getPositionX() + 1);
				}
				break;
			case 3:
				if(pacman.getPositionY() < 465){
					pacman.setPositionY(pacman.getPositionY() + 1);
				}
				break;
		}
	}
}
