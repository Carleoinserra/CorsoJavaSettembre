import java.util.Scanner;


public class CifrarioCesare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Inserisci una parola: "); 
		Scanner sc =new Scanner(System.in); 
		String parola = sc.nextLine(); 
		System.out.println(new StringBuilder(parola).reverse());
	}

}
