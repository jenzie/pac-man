package models;

/**
 * Author:      Grant Kurtz
 */
public class Map{

	public enum Tile{
		WALL,
		PELLET,
		EMPTY
	}

	public Tile[][] board = new Tile[30][40];

	public Map(){

	}
}
