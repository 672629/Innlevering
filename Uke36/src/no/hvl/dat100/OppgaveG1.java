package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG1 {

	public static void main(String[] args) {
		
		int n = 1;
		
		for( ; n <= 10; n++){
			String tallTxt = showInputDialog("Skriv inn tall: ");
			int tall = parseInt(tallTxt);
			
			if(n != tall) {
				System.out.println(n);
			}
		}
	}

}
