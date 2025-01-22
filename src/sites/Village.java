package sites;

import personnages.Gaulois;

public class Village {
	
	protected Gaulois chef;
	protected Gaulois villageois[];
	int nbGaulois;
	
	public Village (Gaulois chef) {
		this.chef=chef;
		this.villageois[0]=chef;
		this.nbGaulois=1;
		
	}
	
	public Gaulois getChef() {
		return this.chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (this.nbGaulois==5) {
			this.chef.parler("Désolé" + gaulois.getNom() + "mon village est déjà bien rempli.");
		} else {
			this.villageois[nbGaulois]=gaulois;
			this.nbGaulois+=1;
			this.chef.parler("Bienvenue"+ gaulois.getNom()+"!");
		}
	}
}