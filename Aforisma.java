
 interface Aforisma {
  


 public boolean ricerca(String x);
	 
 public String getAutore();}

class AforismaAmore  implements Aforisma{
		
	public String autore;
	public String categoria;
	public String testo;
	public boolean chiave = false;
	
	public AforismaAmore(String autore, String testo) {
		this.autore = autore;
		this.testo = testo;
		this.categoria = "amore";
		
	}
	
	public boolean ricerca(String s) {
		if (s.equalsIgnoreCase(autore)) {
			chiave = true; 
		}
		return chiave; 
		} 	
	public String getAutore() {
		return autore;
	}}

	/*
	
	
	
}

class AforismaAmicizia  extends Aforisma{

	public AforismaAmicizia(String autore) {
		super(autore);
		this.categoria = "amicizia";
	}
	
	public boolean ricerca(String s) {
		if (s.equalsIgnoreCase(autore)) {
			chiave = true; 
		}
		return chiave; 
		} 	
	
}

class AforismaFamiglia  extends Aforisma{

	public AforismaFamiglia(String autore) {
		super(autore);
		this.categoria = "famiglia";
	}
	
	public boolean ricerca(String s) {
		if (s.equalsIgnoreCase(autore)) {
			chiave = true; 
		}
		return chiave; 
		} 	
	
} */

