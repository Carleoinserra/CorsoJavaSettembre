import java.util.Scanner; 

public class MediaNumeri { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 


System.out.println("Inserisci un numero intero positivo"); 

Scanner sc= new Scanner(System.in); 
int numero1= sc.nextInt(), contatore = 0, numero2=0, somma=0, media=0; 


do { 
somma=somma+numero1; 
contatore++; 

System.out.println("Inserisci un altro numero positivo"); 
numero1= sc.nextInt(); 

if(numero1 <= 0) { 
media=somma/contatore; 
System.out.println("La media dei numeri inseriti e':" + " " + media); 
} 


} while (numero1 > 0); 
} 

}