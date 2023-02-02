package logic;

public class Position {
	private int row;
	private int col;
	
	public Position() {
		
	}

	public Position(int r, int c) {
		this.row = r;
		this.col = c;
	}
	
	public boolean equals(Position other) {
		if (this.row == other.getRow() && this.col == other.getCol())
			return true;
		return false;
	}
	
	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}
	
	public boolean setRow(int r) {
		try {
			this.row = r;
			return true;
		}
		catch (NumberFormatException ex) {
			return false;
		}
	}

	public boolean setCol(int c) {
		try {
			this.col = c;
			return true;
		}
		catch (NumberFormatException ex) {
			return false;
		}
	}
}