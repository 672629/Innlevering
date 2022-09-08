package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			String poengTxt = showInputDialog("Skriv in poeng: ");
			int poeng = parseInt(poengTxt);
			
			while(poeng < 0 || poeng > 100) {
				String nyPoengTxt = showInputDialog("Ugyldig poeng, skriv inn nytt poeng: ");
				poeng = parseInt(nyPoengTxt);
			}
			
			int karakter = 0;
			int[] arrPoeng = {39, 49, 59, 79, 89};
			
			for( ; karakter < arrPoeng.length; karakter++) {
				if(poeng <= arrPoeng[karakter]) {
					break;
				}
			}
			
			switch(karakter) {
				case 0:
					System.out.println("Karakter F");
					break;
					
				case 1:
					System.out.println("Karakter E");
					break;
					
				case 2:
					System.out.println("Karakter D");
					break;
					
				case 3:
					System.out.println("Karakter C");
					break;
					
				case 4:
					System.out.println("Karakter B");
					break;
					
				case 5:
					System.out.println("Karakter A");
					break;
			}
			
		}
		
	}
	
}