package test_fonctionnel;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois asterix = new Gaulois("Ast�rix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);

		Druide panoramix = new Druide("Panoramix",8);
		
		panoramix.concocterPotion(3);
		panoramix.donnerPotion(asterix);
		System.out.println(asterix.getBoost());

		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);

		
		Romain minus = new Romain("Minus",6);

		asterix.parler(" Bonjour � tous ");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
	}
}