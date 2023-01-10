import java.util.Arrays;
public class Main {

	public static void main (String[] args){
			// Stampa a console  la frase
				System.out.println("This is my first Epicode Java Project!");
				System.out.println("la tua moltipliczione è: " + moltiplica(5,3));
				System.out.println(concatena("Ciao il tuo numero è: ", 5));
				
				String[] words = {"back-end", "java", "programming", "database","fullstack"};
				System.out.println("Nuovo array: " + Arrays.toString(inserisciInArray(words,"ciao")));
								
			
	}

	static int moltiplica(int a, int b) {
		return a * b;
	}

	static String concatena(String x, int y) {
		return x + y;
	}

	static String[] inserisciInArray(String[] x, String y) {
		String[] newArray = new String[6];
		newArray[0] = x[0];
		newArray[1] = x[1];
		newArray[2] = y;
		newArray[3] = x[2];
		newArray[4] = x[3];
		newArray[5] = x[4];
		return newArray;
	}
}
