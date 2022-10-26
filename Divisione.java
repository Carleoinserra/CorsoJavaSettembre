
import java.util.Scanner; 

public class Divisione { 

public static void main(String[] args) { 

int numero1; 
int numero2; 

System.out.print("Inserisci un numero intero: "); 
Scanner sc = new Scanner(System.in); 
numero1 = sc.nextInt(); 
System.out.print("Inserisci un altro numero intero: "); 
numero2 = sc.nextInt(); 

//Stampa del quoziente 
int quoziente = numero1/numero2; 
System.out.println("Il quoziente di " + numero1 + "/" + numero2 + " è " + quoziente); 

//Stampa del resto 
int resto = numero1 % numero2; 
System.out.println("Il resto di " + numero1 + "/" + numero2 + " è " + resto); 
} 

}