import java.util.Scanner;
public class Lampadina {
	
	
	String stato;
	int numeroClick;
	int numeroMassimo;
	
	
	public  Lampadina(String stato) {
		
		
	this.stato = stato;
	this.numeroClick = 0;
}
	
	public String stato() {
		
		return stato;
		
	}
	
	public void numeroClick() {
		System.out.println("QUanti click sono consentiti?");
		Scanner sc= new Scanner(System.in);
		numeroMassimo = sc.nextInt();
	}
	
	public void click(int scelta) {
		
		if ((scelta == 1 || scelta == 2) && numeroClick < numeroMassimo) {
		
		
			if (scelta == 1) 
				
				 {stato = "on"; 
				numeroClick += 1;}
				else if (scelta == 2) 
					{stato = "off"; 
					numeroClick += 1;}}
				
		
		
		else if (numeroClick == numeroMassimo) {
			stato = "down";
		}}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	int input = 1;
	Lampadina x = new Lampadina("on");
	x.numeroClick();
	
	do {
	System.out.println("cosa vuoi fare? Premi 1 per accendere 2 per spegnere 0 per terminare il programma");
	Scanner sc= new Scanner(System.in);
	input = sc.nextInt();
	if (input == 1) {x.click(input); System.out.println(x.stato); }
	else if (input == 2){x.click(input); System.out.println(x.stato); }
	else if (input == 0){ System.out.println("ciao!"); }
	else System.out.println("numero non valido");
	}
	
	
	
	
	
	while (input != 0);

	}}
