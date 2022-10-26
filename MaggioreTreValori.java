
 

import java.util.Scanner; 

public class MaggioreTreValori { 

public static void main(String[] args) { 

int num1; 
int num2; 
int num3; 

System.out.print("Inserisci il primo numero: "); 
Scanner sc = new Scanner(System.in); 
num1 = sc.nextInt(); 
System.out.print("Inserisci il secondo numero: "); 
num2 = sc.nextInt(); 
System.out.print("Inserisci il terzo numero: "); 
num3 = sc.nextInt(); 

if(num1 > num2 && num1 >num3) 
System.out.println("Il numero maggiore è: " + num1); 
else if(num2 > num1 && num2 > num3) 
System.out.println("Il numero maggiore è: " + num2); 
else if(num3 > num1 && num3 >num2) 
System.out.println("Il numero maggiore è: " + num3); 
else 
System.out.println("I numeri sono tutti uguali"); 

} 
}