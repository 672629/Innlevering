package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String nTxt = showInputDialog("Skriv inn heltall: ");
		int n = parseInt(nTxt);
		
		while(n < 0) {
			nTxt = showInputDialog("Ugyldig tall, skriv inn heltall: ");
			n = parseInt(nTxt);
		}
		
		int resultat = 1;
		
		for( ; n > 0; n--) {
			resultat = resultat * n;
		}
		System.out.println(resultat);
	}
}