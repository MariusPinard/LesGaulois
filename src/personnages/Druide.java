package personnages;

import java.security.SecureRandom;

public class Druide extends Gaulois {
	
	private SecureRandom random;
	private int forcePotion;
	private int nbPotion;
	
	public Druide (String nom, int force) {
		super(nom,force);
		try {
			random = SecureRandom.getInstanceStrong(); 
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
	
	public void concocterPotion (int nbDose) {
		nbPotion=nbDose;
		forcePotion=random.nextInt(6)+2;
		this.parler(" « J'ai concocté" + nbDose + "doses de potion magique. Elle a une force de" + this.random + ". ». ");
	}
	
	public void donnerPotion (Gaulois gaulois) {
		if (gaulois.getNom()=="obelix") {
			System.out.println(" « Non, Obélix Non !... Et tu le sais très bien ! »");
		} else if (nbPotion==0) {
			this.parler(" « Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion. »");
		} else {
			gaulois.boostGaulois(forcePotion);
			this.parler(" « Tiens " + gaulois.getNom() + " un peu de potion magique. »");
		}
	}
	
}