package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Personnage;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
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