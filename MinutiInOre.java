
import java.util.Scanner; 

public class MinutiInOre { 

public static void main(String[] args) { 

int minuti; 

Scanner sc = new Scanner(System.in); 

System.out.print("Inserisci un numero di minuti (es: 210): "); 
minuti = sc.nextInt(); 

// Conversione in ore 
double ore = (double)minuti/60; 

//Stampa del risultato 
System.out.println(minuti + " minuti sono "+ ore + " ore."); 
} 

}