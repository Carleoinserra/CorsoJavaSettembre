
import java.util.Scanner; 

public class GiorniSettimana{ 

public static void main(String[] args) { 

int giorno; // giorno come numero intero 

System.out.print("Inserisci un numero corrispondente a un giorno della settimana: "); 

Scanner sc = new Scanner(System.in); 
giorno = sc.nextInt(); 

if(giorno ==1) 
{ 
System.out.println("Lunedì"); 
} 

else if(giorno ==2) 
{ 
System.out.println("Martedì"); 
} 

else if(giorno ==3) 
{ 
System.out.println("Mercoledì"); 
} 

else if(giorno ==4) 
{ 
System.out.println("Giovedì"); 
} 

else if(giorno ==5) 
{ 
System.out.println("Venerdì"); 
}	

else if(giorno ==6) 
{ 
System.out.println("Sabato"); 
}	

else if(giorno ==7) 
{ 
System.out.println("Domenica"); 
}	

else 
{ 
System.out.println("Giorno non valido"); 
} 

} 

}