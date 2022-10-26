import java.util.Scanner;
public class ContaNumeriCrescenti {




    public static void main(String args[]) {
        /* local variable Initialization */
        
        int cont = 0;
        int x = 0;
        int temp;

        /* do-while loops execution */
        do {
        	System.out.print("Inserisci un numero crescente: "); 
    		
    		
    		temp = x;
    		
    		Scanner sc = new Scanner(System.in);
    		x = sc.nextInt();
    		cont++;
    		if (x < temp) {
    			
    			System.out.println(cont-1);}
    		
    		
        } while (x > temp);
    }
}