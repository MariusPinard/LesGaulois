package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",6);
		System.out.println(asterix);
		asterix.parler("Bonjour � tous");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
	
}