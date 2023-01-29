package logic;

import java.util.ArrayList;
import logic.Position;
import gui.Console;

public class Map {
	private int rows;
	private int cols;
	private String[][] map;
	private ArrayList<Position> enemies;

	public Map(int r, int c) {
		rows = r;
		cols = c;
		enemies = new ArrayList<Position>();
		createMap();
	}

	private void createMap() {
		map = new String[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++)
				map[r][c] = " ";
		}
	}

	public void showMap() {
		System.out.print("     ");
		for (int c = 1; c <= cols; c++)
			System.out.print("|" + c + "| ");
		System.out.println();
		for (int r = 0; r < rows; r++) {
			System.out.print(" |" + (r + 1) + "|");
			for (int c = 0; c < cols; c++)
				System.out.print(" |" + map[r][c] + "|");
			System.out.println();
		}
	}

	private boolean checkEnemy(Position e) {
		if (enemies == null)
			return false;
		for (Position enemy : enemies) {
			if ( enemy.equals(e) )
				return true;
		}
		return false;
	}

	public boolean addEnemy(Position e) {
		if ( checkEnemy(e) )
			return false;
		map[e.getRow()][e.getCol()] = "X";
		enemies.add(e);
		return true;
	}

	public void showEnemies() {
		for (Position e : enemies)
			System.out.println(" r: " + e.getRow() + " c: " + e.getCol());
	}
}
