import java.util.Scanner; 

public class luca { 

public static void main(String[] args) { 
// TODO Auto-generated method stub 

System.out.println("Inserisci un numero superiore a 0:"); 

Scanner sc= new Scanner(System.in); 
int numero1= sc.nextInt(), n=0, times = 0, x=0; 


do { 

times++; 
System.out.println(times); 
System.out.println("Serie di" + "" + times); 
System.out.println("Inserisci un altro numero maggiore"); 
Scanner sc2= new Scanner(System.in); 
int numero2= sc2.nextInt(); 
x=numero2; 


} while (numero1 > x ); 




} 

}

