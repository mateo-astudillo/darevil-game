package logic;

import gui.Console;

public class DarevilGame {
	public static void main(String[] args) {
		Console.println(" Inserte numero de filas");
		int rows = Console.getInt(1, 10);
		Console.println(" Inserte numero de columnas");
		int cols = Console.getInt(1, 10);

		Map map = new Map(rows, cols);

		String user = "Si";
		String[] options = {"si", "no", "s", "n"};
		while ( user.equalsIgnoreCase("si") || user.equalsIgnoreCase("s")) {
			Position enemy = new Position();
			Console.print("\033[H\033[2J");
			map.showEnemies();
			map.showMap();
			Console.println(" Fila del enemigo");
			enemy.setRow( Console.getInt(1, rows) - 1 );
			Console.println(" Columna del enemigo");
			enemy.setCol( Console.getInt(1, cols) - 1 );
			if ( !map.addEnemy(enemy) )
				Console.println("\n ¡Lugar ocupado!\n");
			do  {
				Console.print(" ¿Desea agragar un enemigo?\n (si o no)\n > ");
				user = Console.getString();
			} while ( !Console.match(user, options) );
		}
	}
}


