package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		String nedreGrenseTxt = showInputDialog("Skriv inn nedre grense: ");
		int nedreGrense = parseInt(nedreGrenseTxt);
		System.out.println("Nedre grense " + nedreGrense);
		
		String øvreGrenseTxt = showInputDialog("Skriv inn Øvre Grense: ");
		int øvreGrense = parseInt(øvreGrenseTxt);
		System.out.println("Ovre grense " + øvreGrense);
		
		System.out.print("Resultat: ");
		
		int resultat = 0;
		
		for(int i = nedreGrense; i <= øvreGrense; i++) {
			resultat = i % 2;
			if(resultat == 1) {
				System.out.print(i);
				if(i != øvreGrense) {
					System.out.print(", ");
				}
			}
		}
	}
}
