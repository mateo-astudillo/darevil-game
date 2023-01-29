package logic;

public class Position {
	private int row;
	private int col;
	
	public Position() {
		
	}

	public Position(int r, int c) {
		row = r;
		col = c;
	}
	
	public boolean equals(Position other) {
		if (row == other.getRow() && col == other.getCol())
			return true;
		return false;
	}
	
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public boolean setRow(int r) {
		try {
			row = r;
			return true;
		}
		catch (NumberFormatException ex) {
			return false;
		}
	}

	public boolean setCol(int c) {
		try {
			col = c;
			return true;
		}
		catch (NumberFormatException ex) {
			return false;
		}
	}
}