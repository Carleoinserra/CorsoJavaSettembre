
public class Officina {

	
	boolean guasto;
	String categoria;
	int prezzo = 0;
	
		public Officina( ) {
			
		
			
			
		}
		
     public int ripara(Vettura e) {
    	 
    	 
    	if (e.tipologia.equalsIgnoreCase("utililitaria")) {
    		
    		prezzo = 50;
    	}
    	
    	else if  (e.tipologia.equalsIgnoreCase("suv")) {
    		
    		prezzo = 100;
    		
    	}
    	
    	else if  (e.tipologia.equalsIgnoreCase("monovolume")) {
    		
    		prezzo = 80;
    	 
    	
    		 
    		 
    	 }
    	 return prezzo;
    	 
    	 
    	 
     }
     
     public int ripara(Motociclo b)  {
    	 
    	 if (b.cilindrata == 50) {
    		 
    		 prezzo = 50;
    	 }
    	 
    	 return prezzo;
     }



}




		