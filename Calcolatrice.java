import java.util.Scanner; 

public class Calcolatrice { 

static int x; 
static int y; 
static int operazione; 

public static void main(String[] args) { 

// Inserimento numeri 
System.out.print("Inserisci un numero: "); 
Scanner sc = new Scanner(System.in); 
x = sc.nextInt(); 
System.out.print("Inserisci un altro numero: "); 
y = sc.nextInt(); 

// Inserimento operazioni 
System.out.print("Inserisci 1 per somma, 2 per sottrazione, 3 per moltiplicazione, 4 per divisione intera"); 
operazione = sc.nextInt(); 
if (y == 0) { 
System.out.println("Per favore inserisci un numero diverso da 0"); 
}else 
switch(operazione) { 
case 1: 
int somma = x + y; 
System.out.println(x + "+ " + y + " = " + somma); 
break; 
case 2: 
int sottrazione = x - y; 
System.out.println(x + "- " + y + " = " + sottrazione); 
break; 
case 3: 
int moltiplicazione = x * y; 
System.out.println(x + "- " + y + " = " + moltiplicazione); 
break; 
case 4: 
int quoziente = x/y; 
int resto = x%y; 
System.out.println(x + "/" + y + " ha quoziente " + quoziente + " e resto " + resto); 
break; 
default: 
System.out.println("Operazione errata"); 
} 
} 
}
