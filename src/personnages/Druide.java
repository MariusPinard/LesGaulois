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
		forcePotion=random.nextInt(4)+2;
		this.parler(" � J'ai concoct�" + nbDose + "doses de potion magique. Elle a une force de " + forcePotion + ". �. ");
	}
	
	public void donnerPotion (Gaulois gaulois) {
		if (gaulois.getNom()=="Obelix") {
			this.parler(" � Non, Ob�lix Non !... Et tu le sais tr�s bien ! �");
		} else if (nbPotion==0) {
			this.parler(" � D�sol� " + gaulois.getNom() + " il n'y a plus une seule goutte de potion. �");
		} else {
			gaulois.boostGaulois(forcePotion);
			//System.out.println(gaulois.getBoost());
			this.parler(" � Tiens " + gaulois.getNom() + " un peu de potion magique. �");
			nbPotion-=1;
		}
	}
	
}