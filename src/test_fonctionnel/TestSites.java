package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix",15);
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus",2,"SOLDAT");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");
		System.out.println("");
		
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois atserix = new Gaulois("Astérix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		
		Soldat brutus = new Soldat("Brutus",5,"CENTURION");
		Soldat milexcus = new Soldat ("Milexcus",2,"SOLDAT");
		Soldat tulliusOcopus = new Soldat("Tullius Octopus",2,"TESSERARIUS");
		Soldat ballondebaudrus = new Soldat("ballondebaudrus",3,"OPTIO");
		
		village.ajouterVillageois(agecanonix);
	}
}
