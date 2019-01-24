package Domini;

public class Puzzle {

	private Casella[][] taulell, taulellOriginal;
	private Casella casellaBuida;
	private int movimentsDesordre, movimentsJugador;
	private final int NOMBRE_FILES_COLUMNES;

	/*
	 * Inicialitzar els atributs
	 * Crear els taulells i desordenar al puzzle
	 */
	public Puzzle(int valor) {
		NOMBRE_FILES_COLUMNES = valor;
		
		//PENDENT IMPLEMENTAR
	}

	public String [][] getPuzzle() {		
		return this.transformarTaulellAText(taulell);
	}
	
	public String[][] getPuzzleInicial() {		
		return this.transformarTaulellAText(taulellOriginal);
	}
	
	/*
	 * Retorna una matriu amb un taullel com a text
	 */
	private String[][] transformarTaulellAText(Casella[][] puzzleATransormar) {
		//PENDENT IMPLEMENTAR
		return null;//RETORN PROVISIONAL

	}

	public int getMovimentsDesordre() {
		return movimentsDesordre;
	}

	public int getMovimentsJugador() {
		return movimentsJugador;
	}

	/*
	 * Retorna cert si dues caselles, una de l'atribut taulell i l'atra del taulell original,
	 * que tenen la mateixa coordenada, tenen contingut diferent (el puzzle no està ordenat).
	 * Altrament retorna fals
	 */
	public boolean getContinuarJugant() {
		//PENDENT IMPLEMENTAR
		return false;//RETORN PROVISIONAL

	}

	/*
	 * Si al valor de l'argument no és un valor vàlid del taulell retorna un text d'error.
	 * Altrament cerca la casella del taulell amb el valor de l'argument. Un cop trobada
	 * crida al mètode intercanviarCasellaXBuida per intercanviar-la amb la casella buida.
	 * També incrementa el nombre de moviments fets pel jugador, si tot és correcte.
	*/
	public String ferMoviment(int valorCasella) {
		//PENDENT IMPLEMENTAR
		return null;//RETORN PROVISIONAL

	}	
	
	/*
	 * La casellaVeina de l'argument crida el mètode intercanviarCoordenadesCaselles 
	 * pasant-li com argument la casella buida. Si no hi ha cap error, canvia de posició
	 * les dues caselles dins l'atribut taulell.
	 * En cas d'error, retorna un text per informar-lo
	 */
	private String intercanviarCasellaXBuida(Casella casellaVeina){
		//PENDENT IMPLEMENTAR
		return null;//RETORN PROVISIONAL
	}
	
	/*
	 * Inicialitza els dos atributs taulell totalment ordenats, 
	 * creant per a cada un d'ells una nova casella.
	 * Les caselles buides han d'estar en la última posició dels taulells. 
	 * També inicialitza l'atribut casellaBuida.
	 */
	private void crearPuzzleInicial() {
		//PENDENT IMPLEMENTAR
	}

	/*
	 * 1. Calcular el valor de l'atribut movimentsDesordre (nombre de moviments per desordenar al puzle)
	 * que s'ha de calcular de forma aleatòria (mètode generarAleatori),
	 * entre la meitat i al doble (ambdós inclosos) del nombre de caselles del taulell.
	 * 2. Per cada moviment:
	 *  2.1. Obtenir totes les caselles veines a la casella buida (mètode trobarVeinsPosicioBuida)
	 *  2.2. Escollir-ne una aleatoriamnt per intercanviar-la amb la casella buida. La triada no podrà ser
	 *  la del darrer intercanvi.
	 *  2.3. Intercanviar la casella escollida amb la casella buida (mètode intercanviarCasellaXBuida)
	 *  Tot s'ha de repetir si al final el puzle no queda desordenta, fins a logrr que quedi desordenat
	 */
	public void desordenarPuzzle() {
		//PENDENT IMPLEMENTAR
	}

	/*
	 * Retorna en un vector les caselles veines a la posició buida.
	 * Aquest vector ha de tenir una longuitud de 2, 3 o 4 depenent
	 * de la situació de la casella buida en al taulell
	 */	
	private Casella[] trobarVeinsPosicioBuida() {
		//PENDENT IMPLEMENTAR
		return null;//RETORN PROVISIONAL
	}
	
	/*
	 * retorna un nombre aleatori entre i i j
	 * essent i < j, ambdós inclosos
	 */
	private int generarAleatori(int i, int j) {
		return (int) Math.floor(Math.random() * (j - i + 1) + i);
	}	
}