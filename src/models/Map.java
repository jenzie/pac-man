package models;

import java.util.Arrays;

/**
 * Author:      Grant Kurtz
 */
public class Map{

	public enum Tile{
		WALL,
		PELLET,
		EMPTY
	}

	public Tile[][] board = new Tile[32][24];

	public Map(){
		createBasicMap();
		System.out.println();
	}

	private void createBasicMap(){
		for(int i = 0; i < 32; i++){
			Arrays.fill(board[i], Tile.EMPTY);
		}

		for(int i = 0; i < 24; i++){
			board[0][i] = Tile.WALL;
			board[31][i] = Tile.WALL;
		}
		for(int i = 0; i < 32; i++){
			board[i][0] = Tile.WALL;
			board[i][23] = Tile.WALL;
		}
	}

	public int resolveTile(int x){
		return x / 20;
	}

	public boolean isEmpty(int x, int y){
		return board[x][y] == Tile.EMPTY;
	}

	public Tile[][] getMap(){
		return board;
	}
}
