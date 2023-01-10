import java.util.Scanner;

public class RettangoloMain {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		
		  System.out.println("Inserisci la lughezza decimale del primo lato:"); 
		  double a = Double.parseDouble(in.nextLine());
		  
		  System.out.println("Inserisci la lughezza decimale del secondo lato:");
		  double b = Double.parseDouble(in.nextLine());
		  
		  System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(a, b));
		  
		  
		  
		  System.out.println("Inserisci un numero:"); 
		  int x = Integer.parseInt(in.nextLine()); System.out.println(pariDispari(x));
		 
		
		System.out.println("Inserisci il valore decimale del primo lato di un triangolo:");
		double c = Double.parseDouble(in.nextLine());
		
		System.out.println("Inserisci il valore decimale del secondo lato di un triangolo:");
		double d = Double.parseDouble(in.nextLine());
		
		System.out.println("Inserisci il valore decimale del terzo lato di un triangolo:");
		double e = Double.parseDouble(in.nextLine());
		
		System.out.println("L'area del triangolo è: "+ perimetroTriangolo(c,d,e));
		
		// chiusura scanner
		in.close();
		
	}

	static double perimetroRettangolo(double a, double b) {
		return (2 * a) + (2 * b);
	}
	
	static int pariDispari(int x) {
		if (x%2==0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	static double perimetroTriangolo(double c, double d, double e) {
		double perimeter = c+d+e;
		double p = perimeter/2;
		return Math.sqrt(p*(p-c)*(p-d)*(p-e));
	}
	

}
