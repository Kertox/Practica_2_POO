package Presentacio;

import Domini.Puzzle;
import jconsole.JConsole;

public class PresentacioJocPuzzle {

	private Puzzle jocPuzzle;
	private JConsole consolaTaulell;// per mostrar al jugador al taulell
	private JConsole consola;// per demanar al jugador que vol fer	

	public PresentacioJocPuzzle(JConsole consola, int valor) {
		this.jocPuzzle = new Puzzle(valor);
		this.consolaTaulell = new JConsole(50, 27);
		this.consolaTaulell.setCursorVisible(false);
		this.consolaTaulell.setLocation(30, 60);
		this.consolaTaulell.setEnabled(false);
		this.consola = consola;
		this.consola.clear();
		tornJugador();
	}

	private void tornJugador() {
		mostrarPuzzleOrdenat();		
		mostrarPuzzleActual("Puzzle desordenat amb " + jocPuzzle.getMovimentsDesordre() + " moviments.");
		boolean sortir = false;
		String entrada;
		while (!sortir) {
			consola.print("Entra el número de la casella que vols moure: ");
			entrada = this.consola.readLine();
			String missatge = this.validarExecutarEntrada(entrada);
			if (missatge != null) {
				this.consola.println(missatge);
			} else {
				mostrarPuzzleActual("Nombre de moviements fets: " + jocPuzzle.getMovimentsJugador());
				sortir = !jocPuzzle.getContinuarJugant();
			}
		}
		this.consola.println("Nombre de moviments per ordenar el puzle:" + jocPuzzle.getMovimentsJugador());
		this.consola.println("Nombre de moviments per desordenar el puzle:" + jocPuzzle.getMovimentsDesordre());		
		this.consola.println("FI JOC PUZZLE.");
		this.consolaTaulell.println("FI JOC PUZZLE.");
	}
	
	private String validarExecutarEntrada(String entrada) {
		if (!this.isNumeric(entrada)) {
			return "ERROR: cal entrar un valor numèric d'alguna de les caselles.";
		}
		int valorCasella = Integer.parseInt(entrada);
		return jocPuzzle.ferMoviment(valorCasella);
	}

	// Retorna cert si la cadena és un enter i fals altrament
	private boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	private void mostrarPuzzleActual(String missatge) {
		this.mostrarPuzzle(missatge, jocPuzzle.getPuzzle());		
	}

	private void mostrarPuzzleOrdenat() {
		this.mostrarPuzzle("Puzzle inicial ordenat.", jocPuzzle.getPuzzleInicial());
	}

	private void mostrarPuzzle(String missatge, String[][] puzzle) {
		if (puzzle != null) {
			consolaTaulell.println(missatge);
			for (int fila = 0; fila < puzzle.length; fila++) {
				for (int columna = 0; columna < puzzle[0].length; columna++) {
					consolaTaulell.print(puzzle[fila][columna] + espais(puzzle[fila][columna]));
				}
				consolaTaulell.println();
			}
			consolaTaulell.println();
		}
	}

	private String espais(String numero) {		
		int numEspais = 6 - numero.length();
		String espais ="";
		for (int i = 0; i < numEspais; i++)
			espais += " ";
		return espais;
	}
}