
public class JukeBoxe { 
public String TitoloCanzone; 
public String Autore; 


public JukeBoxe(String x, String y) { 



this.TitoloCanzone = x; 
this.Autore = y; 



} 
}
class Canzone extends JukeBoxe { 
public String Nazione; 
public int Anno; 


public Canzone(String z, String w, String nazione, int p) { 
super(z, w); 
this.Anno = p;
this.Nazione = nazione;
}

public void setAnno(int w) { 

this.Anno = w; 
} 

public boolean testAnno(int x) {
	boolean test = true;
	if (Anno != x) {
		test = false;
	}
	return test;
	
}

public String Visualizza() { 

return ("titolo: " + TitoloCanzone + "Autore:" + Autore + "Nazione: " + Nazione + " Anno : " + Anno); 
}

public int getAnno() {
	// TODO Auto-generated method stub
	return Anno;
}

public String getNazionalita() {
	// TODO Auto-generated method stub
	return Nazione;
} 
}