package Domini;

public class Casella {
	public int fila, col;
	public final int value;
	private static final int EMPTY_VALUE = 0;
	
	//PENDENT IMPLEMENTAR	

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isEqual (Casella casella) {
		if (fila == casella.fila && col == casella.col) return true;
		else return false;
	}
	
	public String swapCell (Casella casella) {
		
		if (casella.value != EMPTY_VALUE) {
			return "ERROR: No espoden intercanviar dues caselles plenes.";
		}
		else {
			if (casella.col==col-1 && casella.fila==fila) {
				makeMove(casella);
				return null;
			}
			else if (casella.col==col+1 && casella.fila==fila) {
				makeMove(casella);
				return null;
			}
			else if (casella.col==col && casella.fila==fila-1) {
				makeMove(casella);
				return null;
			}
			else if (casella.col==col && casella.fila==fila+1) {
				makeMove(casella);
				return null;
			}
			else {
				return "ERROR: Les caselles no son veïnes horitzontals o verticals.";
			}
		}
	}
	
	private void makeMove (Casella casella) {
		int fila1, fila2, col1, col2;
		
		fila1 = fila;
		col1 = col;
		fila2 = casella.fila;
		col2 = casella.col;
		
		fila = fila2;
		col = col2;
		casella.fila = fila1;
		casella.col = col1;
	}
}
