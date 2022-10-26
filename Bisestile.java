
import java.util.Scanner; 

public class Bisestile { 

public static void main(String[] args) { 
int anno; 
do { 
// Prompt utente 
System.out.print("Inserisci un anno: "); 
Scanner sc =new Scanner(System.in); 
anno = sc.nextInt(); 
}while(anno<0); 

if (bisestile(anno)) 
System.out.println(anno + " bisestile"); 
else 
System.out.println(anno + " bisestile"); 

} 

public static boolean bisestile(int anno) { 
if (anno % 4 == 0 || (anno % 100 == 0 && anno % 400 == 0) ) 
return true; 
else 
return false; 
} 
}
