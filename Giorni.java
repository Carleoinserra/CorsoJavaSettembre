import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.util.Scanner; 

import java.util.Scanner; 

public class Giorni { 


static void dataCompleanno(int giorniAlCompleanno) { 
System.out.println("Mancano " + giorniAlCompleanno + " al tuo compleanno"); 
} 

public static void main(String[] args) { 
// TODO Auto-generated method stub 

System.out.println("Inserisci il tuo giorno del compleanno su 365 giorni: "); 
Scanner sc= new Scanner(System.in); 
int gCompleanno = sc.nextInt(); 
int giorniAlCompleanno; 
int giornoAttuale=251; 


if(gCompleanno>251) { 

giorniAlCompleanno= gCompleanno - giornoAttuale; 

}else { 
giorniAlCompleanno=(365-giornoAttuale)+gCompleanno; 
} 

dataCompleanno(giorniAlCompleanno); 
} 

}