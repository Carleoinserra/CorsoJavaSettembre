
import java.util.Scanner; 

public class Benvenuto { 

public static void main(String[] args) { 
/* 
* crivere un programma ContaNumeriCrescenti che chiede all’utente di inserire una sequenza di numeri interi crescenti 
* (man mano sempre pi`u grandi) e ne stampa la lunghezza (il numero di valori inseriti dall’utente). 
* Il programma termina non appena l’utente inserisce un valore minore o 
uguale al precedente). 
*/ 

System.out.println("Inserire una sequenza crescente di numeri."); 
System.out.println("inserire un numero minore o uguale al precedenre per terminare"); 
Scanner scanner = new Scanner(System.in); 

int numero; 
int numeroPrecedente = 0; 
int contatore=1; 
numero = scanner.nextInt(); 
numeroPrecedente=numero; 
do { 

numero = scanner.nextInt(); 

contatore++; 


} 

while(numero > numeroPrecedente); 

System.out.println("Hai inserito " + contatore + " numeri"); 

} 


}
