package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercing�torix",15);
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
		Village village = new Village(vercingetorix);
		Soldat minus = new Soldat("Minus",2,"SOLDAT");
		minus.parler("Je suis en charge de cr�er un nouveau camp romain.");
		Camp camp = new Camp (minus);
		System.out.println("");
		
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois asterix = new Gaulois("Ast�rix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		
		
		Soldat brutus = new Soldat("Brutus",5,"CENTURION");
		Soldat milexcus = new Soldat ("Milexcus",2,"SOLDAT");
		Soldat tulliusOctopus = new Soldat("Tullius Octopus",2,"TESSERARIUS");
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",3,"OPTIO");
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		System.out.println();
		
		village.afficherVillageois();
		System.out.println();
		camp.afficherCamp();
		
		System.out.println();

		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		village.changerCommandant(abraracourcix);
		
		Soldat briseradius = new Soldat("Briseradius",4,"SOLDAT");
		Soldat chorus = new Soldat("Chorus",3,"CENTURION");
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
