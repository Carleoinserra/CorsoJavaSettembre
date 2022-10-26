import java.util.Scanner; 

public class Cerchio { 

static int raggio; 

public static void main(String[] args) { 

//Predispone l'inserimento dei dati 
System.out.print("Inserisci il raggio: "); 
//Utilizzo della classe Scanner 
Scanner sc = new Scanner(System.in); 
raggio = sc.nextInt(); 

//Calcola l'area del cerchio 
double area = raggio * raggio * 3.14; 

System.out.println("L'area del cerchio di raggio " + raggio + " è " + area); 
} 

}