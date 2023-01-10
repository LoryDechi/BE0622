import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// apertura scanner 
					Scanner in = new Scanner(System.in);
						
					System.out.println( "Inserisci Nome:" );
					String studentName = in.nextLine();
						
					System.out.println( "Inserisci Cognome:" );
					String studentSurname = in.nextLine();
						
					System.out.println( "Inserisci un numero:" );
					int studentNumber = Integer.parseInt( in.nextLine() );
						
					System.out.println(studentName+" "+studentSurname+" "+studentNumber);
					System.out.println(studentNumber+" "+studentSurname+" "+studentName);
						
					// chiusura scanner
					in.close();

	}

}
