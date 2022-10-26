import java.io.Serializable;
import java.util.*;
public class Hit implements Serializable {

	
	public String titolo;
	public String autore;
	
	public  Hit(String titolo, String autore) {
		
		
		this.titolo = titolo;
		this.autore = autore;
	}
	
	public String toString() {
		return ("Titolo: " + titolo + "Autore: " + autore);
		
	}
} 

 class HitParade implements Serializable {
	 
	 
	 public ArrayList<Hit>listaCanzoni;
 public HitParade(ArrayList<Hit>listaCanzoni) {
	 
	 this.listaCanzoni = listaCanzoni;
 }
 
 public void VisualizzaClassifica(){
	 
	 for (int i = 0; i < listaCanzoni.size(); i++) {
		 
		 System.out.println("Posizione:"  + (i+1) + " " +listaCanzoni.get(i).toString());
	 }
 }
 
 public void InserisciCanzone(Hit c) {
	 
	 listaCanzoni.add(c);
 }
public void RimuoviCanzone( int posizione) {
	 
	 listaCanzoni.remove(posizione);
 }

public void ScambiaCanzone(int posizione, int posizione1) {
	Hit temp = listaCanzoni.get(posizione);
	listaCanzoni.set(posizione, listaCanzoni.get(posizione1) );
	
	listaCanzoni.set(posizione1, temp);
}


public void VisualizzaHit(String x){
	 int ok = 0;
	 for (int i = 0; i < listaCanzoni.size(); i++) {
		 
		 if (x.equalsIgnoreCase(listaCanzoni.get(i).autore)
				 ||x.equalsIgnoreCase(listaCanzoni.get(i).titolo)) 
		 {
			 System.out.println("Posizione:"  + (i+1) + " " +listaCanzoni.get(i).toString());
			 ok = 1;
		 }
		 
		
 
}
	 if (ok == 0) {
		 System.out.println("Nessun risultato trovato");
	 }
	
		// TODO Auto-generated constructor stub
	}
	
 }
