
import java.util.ArrayList; 
import java.util.Scanner; 

public class ComiciaPer { 

public static void main(String[] args) { 

ArrayList<String>stringhe = new ArrayList<String>(); 

Scanner sc = new Scanner(System.in); 

String stringa = ""; 
System.out.println("Inserisci una serie di parole e dai invio per terminare"); 
do { 
//System.out.println("Inserisci una serie di parole o una frase e a per terminare"); 
String s = sc.nextLine(); 
stringhe.add(s); 
System.out.println("Inserisci un carattere"); 
String c = sc.nextLine(); 

for (String x : stringhe) { 
if (x.startsWith(c)) {
	System.out.println(x);
}
} 

}while(stringa.equals(" ") == false); 


} 

}
