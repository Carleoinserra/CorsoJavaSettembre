import java.util.Scanner;

public class Asterischi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x;
		System.out.print("Inserisci un numero: "); 
		Scanner sc = new Scanner(System.in); 
		x = sc.nextInt(); 
		String ast = "*";
		int cont = 0;
		String temp;
		
		do {
		System.out.println(ast);
		ast +=  "*";
		cont++;
		
		}
	
	while (cont < x);
	
	
	}
	
	

}
