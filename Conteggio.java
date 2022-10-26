
 

import java.util.Scanner; 

public class Conteggio { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 
Scanner sc = new Scanner(System.in); 

System.out.println("Inserisci un numero maggiore o uguale a 0"); 

int numero = sc.nextInt(); 

if(numero>=0) { 
for (int i = 0; i<=numero; i++) { 
System.out.println(i); 

} 
} else { 
System.out.println("Il valore inserito è errato in quanto numero negativo"); 
} 



} 

} 
