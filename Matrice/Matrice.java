public class Matrice{
	//ATTRIBUTI
		int RIGHE = 0;
		int COLONNE = 0;
		int[][] matrice;
	//---------
	
	Matrice(int RIGHE, int COLONNE){
		this.RIGHE = RIGHE;
		this.COLONNE = COLONNE;
		matrice = new int[RIGHE][COLONNE];
	}
	
	public static void main(String[] args){
		Matrice matrice = new Matrice(10, 10);
		matrice.popola();
		matrice.stampa();
	}
	
	public void popola(){
		int numero = 0; // numero da inserire
		for (int posRiga = 0; posRiga < RIGHE; posRiga++){ // RIGHE è sostituibile con "m.length"
			for (int posColonna = 0; posColonna < COLONNE; posColonna++){ // COLONNE è sostituibile con "m[posRiga].length"
				matrice[posRiga][posColonna] = numero;
				numero++;
			}
		}
	}
	
	public void stampa(){
		StringBuilder stringBuilder = new StringBuilder();
		for (int posRiga = 0; posRiga < RIGHE; posRiga++){ // RIGHE è sostituibile con "m.length"
			for (int posColonna = 0; posColonna < COLONNE; posColonna++){ // COLONNE è sostituibile con "m[posRiga].length"
				stringBuilder.append(String.format("%4d", matrice[posRiga][posColonna])); // aggiungo a una stringa con i contenuti di ciascuna riga
			}
			stringBuilder.append(System.lineSeparator()); // vado a capo
		}
		System.out.print(stringBuilder.toString()); // stampo la stringa
	}
}