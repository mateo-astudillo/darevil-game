package logic;

import java.util.ArrayList;
//import logic.Position;
//import gui.Console;

public class Map {
	private int rows;
	private int cols;
	private String[][] map;
	private ArrayList<Position> enemies;

	public Map(int r, int c) {
		this.rows = r;
		this.cols = c;
		this.enemies = new ArrayList<Position>();
		createMap();
	}

	private void createMap() {
		map = new String[this.rows][this.cols];
		for (int r = 0; r < this.rows; r++) {
			for (int c = 0; c < this.cols; c++)
				map[r][c] = " ";
		}
	}

	public void showMap() {
		System.out.print("     ");
		for (int c = 1; c <= this.cols; c++)
			System.out.print("|" + c + "| ");
		System.out.println();
		for (int r = 0; r < this.rows; r++) {
			System.out.print(" |" + (r + 1) + "|");
			for (int c = 0; c < this.cols; c++)
				System.out.print(" |" + map[r][c] + "|");
			System.out.println();
		}
	}

	private boolean checkEnemy(Position e) {
		if (this.enemies == null)
			return false;
		for (Position enemy : this.enemies) {
			if ( enemy.equals(e) )
				return true;
		}
		return false;
	}

	public boolean addEnemy(Position e) {
		if ( checkEnemy(e) )
			return false;
		map[e.getRow()][e.getCol()] = "X";
		this.enemies.add(e);
		return true;
	}

	public void showEnemies() {
		for (Position e : this.enemies)
			System.out.println(" r: " + e.getRow() + " c: " + e.getCol());
	}
}
