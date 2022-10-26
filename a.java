
import java.util.Scanner; 

public class a { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 

Scanner sc= new Scanner(System.in); 

System.out.println("Inserisci un numero intero"); 
int altezzaTriangolo= sc.nextInt();
String asterisco="*"; 
String aggiuntaAsterisco=asterisco; 
int contatore=1; 

if(altezzaTriangolo < 0) { 
System.out.println("Il numero deve essere positivo!"); 

}else { 
do { 

System.out.println(asterisco); 
asterisco=asterisco+aggiuntaAsterisco; 
contatore++; 
if(altezzaTriangolo <= 0) { 
System.out.println("Il numero deve essere positivo!"); 
} 

} while( contatore <= altezzaTriangolo); 
} 
}	

}