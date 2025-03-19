public class Matrice{
	
	//COSTANTI
		final static int RIGHE = 10;
		final static int COLONNE = 10;
	//--------
	
	public static void main(String[] args){
		int[][] matrice = new int[RIGHE][COLONNE];
		
		popola(matrice);
		stampa(matrice);
	}
	
	public static void popola(int[][] m){
		int numero = 0; // numero da inserire
		for (int posRiga = 0; posRiga < RIGHE; posRiga++){ // sostituibile con "m.length"
			for (int posColonna = 0; posColonna < COLONNE; posColonna++){ // sostituibile con "m[posRiga].length"
				m[posRiga][posColonna] = numero;
				numero++;
			}
		}
	}
	
	public static void stampa(int[][] m){
		for (int posRiga = 0; posRiga < RIGHE; posRiga++){ // sostituibile con "m.length"
			for (int posColonna = 0; posColonna < COLONNE; posColonna++){ // sostituibile con "m[posRiga].length"
				System.out.printf("%5d" , m[posRiga][posColonna]);
			}
			System.out.println();
		}
	}
}