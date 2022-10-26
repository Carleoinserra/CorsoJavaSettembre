
/*Programma Login che ha due campi resgistrati nome "Paolo" cognome "rossi" 
* il programma riceve due input di stringhe e restituisce la stampa login effettuato se le stringhe corrispondono altrimenti login fallito 
*/ 


import java.util.Scanner; 

public class Login { 

public static void main(String[] args) { 
// variabili locali 

String nome = "Paolo"; 
String cognome = "Rossi"; 

// creazione scanner 
Scanner sc= new Scanner(System.in); 

System.out.println("Inserisci un Nome"); 

String inputNome= sc.next(); 

System.out.println("Inserisci un Cognome"); 

String inputCognome= sc.next(); 

if (nome.equals(inputNome) && cognome.equals(inputCognome)) { 
System.out.println("Il login corrisponde " + nome +" "+ cognome); 

}else {System.out.println("Login fallito");} 


} 



} 