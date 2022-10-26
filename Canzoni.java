import java.util.ArrayList; 
import java.util.Scanner; 

public class UsaCanzone { 

public static void main(String[] args) { 

int selezione; 

// Inizializzazione di ArrayList 
ArrayList<Canzoni> canzoni = new ArrayList<Canzoni>(); 
// Elenco canzoni	
Canzoni c1 = new Canzoni("XXXX", "Autore1", 1980, "Francia"); 
Canzoni c2 = new Canzoni("YYYY", "Autore2", 1990, "Francia"); 
Canzoni c3 = new Canzoni("zzzzz", "Autore3", 1970, "Italia"); 
Canzoni c4 = new Canzoni("pppp", "Autore4", 1972, "Italia"); 
Canzoni c5 = new Canzoni("kkkk", "Autore5", 1977, "Germania"); 

// Aggiunta delle canzoni all'ArrayList 
canzoni.add(c1); 
canzoni.add(c2); 
canzoni.add(c3); 
canzoni.add(c4); 
canzoni.add(c5); 

// Prompt utente 
do { 
System.out.println("Inserisci 1-selezione canzoni per anno, " 
+ "2-selezione canzoni per nazionalità, 3-tutte le canzoni , 0-per terminare"); 
Scanner sc = new Scanner(System.in); 
selezione = sc.nextInt(); 

switch(selezione) { 
case 1: 
System.out.println("Inserisci l'anno: "); 
int anno = sc.nextInt(); 
// Controllo anno 
for (Canzoni c : canzoni) { 
if (c.getAnno() == anno) { 
System.out.println(c.visualizza());
} 
} 
break; 
case 2: 
System.out.println("Inserisci la nazione : "); 
String nazione = sc.nextLine(); 
// Controllo nazionalità 
for (Canzoni c : canzoni) { 
if (c.getNazionalita() == nazione) { 
System.out.println(c.visualizza());
} 
} 
break; 
case 3: 
for (Canzoni c : canzoni) { 
System.out.println(c.visualizza());
} 
break; 
default: 
System.out.println("Scelta errata: "); 
} 
sc.close(); 
}while (selezione != 0); 
} 
} 
