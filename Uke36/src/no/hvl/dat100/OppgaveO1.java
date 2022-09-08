package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		String bruttolønnTxt = showInputDialog("Skriv inn din bruttolønn: ");
		int bruttolønn = parseInt(bruttolønnTxt);
		double trinnskatt = 0;
		
		if (bruttolønn <= 190349) {
			System.out.println("Du skal ikke betale trinnskatt");
		}
		else {
			if(bruttolønn <= 267899) {
				trinnskatt = bruttolønn * 0.017;
			}
			else if(bruttolønn <= 643799) {
				trinnskatt = bruttolønn * 0.04;
			}
			else if(bruttolønn <= 969199) {
				trinnskatt = bruttolønn * 0.134;
			}
			else if(bruttolønn <= 1999999) {
				trinnskatt = bruttolønn * 0.164;
			}
			else {
				trinnskatt = bruttolønn * 0.174;
			}
			
			System.out.println("Du maa betale " + trinnskatt + " kroner i trinnskatt");
		}
	}

}
