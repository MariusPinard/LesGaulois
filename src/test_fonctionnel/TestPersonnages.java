package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",6);
		asterix.parler(" Bonjour � tous ");
		minus.parler("UN GAU... UN GAUGAU...");
		minus.recevoirCoup(3);
		minus.recevoirCoup(3);
	}
}