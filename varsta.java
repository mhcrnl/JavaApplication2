

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class varsta {
	private static int verificaVarsta( int an, int luna, int zi){
		Calendar cal = new GregorianCalendar(an, luna, zi);
	    Calendar now = new GregorianCalendar();
	    
	    int rezultat = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
	    
	    if((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH)) || 
			(cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && 
			cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH)))
			{
				rezultat --;
	}
	return rezultat;
}

public static void main (String [] args){
	Scanner input = new Scanner(System.in);
	char ch;
	
	do {
		int an=0, luna=0, zi=0;
		System.out.println("\t Program de calcul al varstei \n");
		System.out.println("Introduceți luna de nastere: ");
		luna = input.nextInt();
		System.out.println("Introduceți ziua de nastere: ");
		zi = input.nextInt();
		System.out.println("Introduceți anul de nastere: ");
		an = input.nextInt();
		System.out.println("Varsta dvs. este: "+ verificaVarsta(an, luna, zi));
		System.out.println("\nDaca doriti sa continuati( y sau n): ");
		ch = input.next().charAt(0);
	} while (ch == 'Y' || ch == 'y'); 
	System.out.println("\n Va multumim pt utilizarea programului \n");
		
	}	
		

}

