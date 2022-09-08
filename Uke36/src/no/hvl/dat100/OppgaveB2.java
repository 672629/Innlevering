package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class OppgaveB2 {

	public static void main(String[] args) {
		
		String xTxt = showInputDialog("Skriv inn tall for x: ");
		double x = parseDouble(xTxt);
		
		String nTxt = showInputDialog("Skriv inn et heltall for n: ");
		int n = parseInt(nTxt);
		
		double resultat = Math.pow(x, n);
		System.out.println(resultat);
		
		double i = 1.0;
		
		while(n >= 1) {
			i = i * x;
			n--;
		}
		System.out.println(i);
	}

}
