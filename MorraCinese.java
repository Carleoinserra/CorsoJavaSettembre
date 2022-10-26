import java.util.Scanner; 

public class MorraCinese { 

/* 
* Esercizio 4 (Gioco della morra cinese a due giocatori) 
Scrivere un programma Java che simuli il gioco della morra cinese. Il programma dovrà prendere in 
ingresso due nomi con cui identificherà i due giocatori. I nomi verranno memorizzati in variabili di 
tipo String. Per ogni giocata, viene chiesto ad entrambi i giocatori di inserire una parola tra
"forbice", "carta" o "pietra"; il programma dovrà stampare a video il nome del 
vincitore. Se la parola in ingresso non è una delle tre previste, il programma dovrà avvisare che è 
stato commesso un errore. Si ricordi che: 
 forbice vince su carta; 
 carta vince su pietra; 
 pietra vince su forbice. 
Nel caso in cui entrambi i giocatori scelgono la stessa stringa, la giocata è pari. 
Terminata una giocata, il programma dovrà chiedere se si intende farne un’altra. In caso negativo, 
terminerà immediatamente l’esecuzione (senza usare il metodo exit()); in caso affermativo, chiederà 
nuovamente ad entrambi i giocatori di inserire una parola tra "forbice", "carta" o 
"pietra", stamperà a video il nome del vincitore, e così via. 
*/ 

public static void main(String[] args) { 

String giocatoreA, giocatoreB; 
String sceltaPlayerA, sceltaPlayerB; // forbicemmmm 
String gioca ; 

Scanner scanner = new Scanner(System.in); 
System.out.println("Inserire il nome del primo giocatore: "); 
giocatoreA = scanner.nextLine(); 

System.out.println("Inserire il nome del secondo giocatore: "); 
giocatoreB = scanner.nextLine(); 

do { 
System.out.println("----------INIZIO PARTITA------"); 
System.out.println(giocatoreA + " sceglie:"); 
sceltaPlayerA = scanner.nextLine(); 
if (sceltaPlayerA.equalsIgnoreCase("forbice") ||sceltaPlayerA.equalsIgnoreCase("pietra") || sceltaPlayerA.equalsIgnoreCase("carta") ) { 
System.out.println(giocatoreB + " sceglie:"); 
sceltaPlayerB = scanner.nextLine(); 

if (sceltaPlayerB.equalsIgnoreCase("forbice") || 
sceltaPlayerB.equalsIgnoreCase("pietra") || 
sceltaPlayerB.equalsIgnoreCase("carta") ) { 
if (sceltaPlayerA.equals("forbice" )&& sceltaPlayerB.equals("carta" )|| sceltaPlayerA.equals("pietra" )&& sceltaPlayerB.equals("carta") || 
sceltaPlayerA.equals("pietra" ) && sceltaPlayerB.equals("forbice")) 
System.out.println("ha vinto " + giocatoreA); 
} 
else { System.out.println(" ha vinto " + giocatoreB);} 
} 
else { // giocatore A ha inserito nomi errati 
System.out.println(giocatoreA + " hai inserito valori errati. Reinserisci"); 

} 
System.out.println("Vuoi giocare ancora? "); 
gioca = scanner.nextLine(); 
} 
while (gioca.equalsIgnoreCase("Y")); 
} 

}