package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	
	protected Gaulois chef;
	protected Gaulois [] villageois;
	int nbGaulois;
	
	public Village (Gaulois chef) {
		this.chef=chef;
		this.villageois = new Gaulois[5];
		villageois[0]=chef;
		this.nbGaulois=1;
	}
	
	public Gaulois getChef() {
		return this.chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (this.nbGaulois==5) {
			this.chef.parler("D�sol� " + gaulois.getNom() + " mon village est d�j� bien rempli.");
		} else {
			villageois[nbGaulois]=gaulois;
			this.nbGaulois+=1;
			this.chef.parler("Bienvenue "+ gaulois.getNom()+"!");
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de " + this.getChef().getNom() + " est habité par :");
		for (int i=0 ; i < this.nbGaulois ; i++) {
			if (this.villageois[i]!=this.getChef()) {
				System.out.println("- " + this.villageois[i].getNom());
			}
		}
	}
	
	public void changerCommandant (Gaulois nouveauChef) {
		this.getChef().parler("« Je laisse mon grand bouclier au grand " + nouveauChef.getNom() + "».");
		nouveauChef.parler("« Merci ! ».");
		this.chef=nouveauChef;
		
	}
}