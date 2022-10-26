import java.util.Scanner; 
public class Nomi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String nome;
 String cognome;
 System.out.print("Inserisci il nome: "); 
//Utilizzo della classe Scanner 
Scanner sc = new Scanner(System.in);
nome = sc.nextLine(); 

System.out.println("Inserisci cognome: ");

Scanner sc1 = new Scanner(System.in);
cognome = sc1.nextLine(); 

System.out.println("Il tuo nome è " + nome + " Il tuo cognome è " + cognome);
 
 
	}

}
