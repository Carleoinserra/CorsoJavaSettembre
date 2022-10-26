import java.util.Scanner;
public class l{
	public static void main(String[] args) { 
	

Scanner scanner = new Scanner(System.in); 
		
		int contatore = 0; 
		Dipendente[] dipendenti = new Dipendente[3]; 
	do { 

		System.out.println("Inserisci il nome del " + (contatore + 1) + "° Dipendente: "); 
		 
		Scanner sc1 = new Scanner(System.in); 
	   
	    String nome = sc1.nextLine(); 

		System.out.println("Inserisci il cognome del " + (contatore + 1) + "° Dipendente: "); 
		Scanner sc2 = new Scanner(System.in); 
		   
	    String cognome = sc2.nextLine(); 

		System.out.println("Inserisci l'età del " + (contatore + 1) + "° Dipendente: "); 
		Scanner sc3 = new Scanner(System.in); 
		   
	    int eta = sc3.nextInt(); 


		System.out.println("Inserisci l'anno di assunzione del " + (contatore + 1) + "° Dipendente: "); 
		Scanner sc4 = new Scanner(System.in); 
		   
	    int anno = sc3.nextInt(); 

		System.out.println("Inserisci lo stipendio mensile del " + (contatore + 1) + "° Dipendente: "); 
		Scanner sc5 = new Scanner(System.in); 
		   
	    int stipendio = sc5.nextInt(); 

		Dipendente dipendente = new Dipendente(nome, cognome, eta, stipendio); 


		dipendenti[contatore] = dipendente; 

		contatore++; 

		} while (contatore < 3); 

}}