package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Camp {
	protected Soldat commandant;
	protected Soldat l_soldats[];
	int nbSoldats;
	
	public Camp (Soldat commandant) {
		this.commandant=commandant;
		this.l_soldats = new Soldat[5];
		l_soldats[0]=commandant;
		this.nbSoldats=1;
	}
	
	public Soldat getCommandant() {
		return this.commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (this.nbSoldats==4) {
			this.commandant.parler("D�sol� " + soldat.getNom() + " notre camp est complet !");
		} else {
			this.l_soldats[nbSoldats]=soldat;
			this.nbSoldats+=1;
			soldat.parler("Je mets mon �p�e au service de Rome dans le camp dirig� par " + this.getCommandant().getNom());
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le village de " + this.getCommandant().getNom() + " contient les soldats :");
		for (int i=0 ; i < this.nbSoldats ; i++) {
			if (this.l_soldats[i]!=this.getCommandant()) {
				System.out.println("- " + this.l_soldats[i].getNom());
			}
		}
	}
	
	public void changerCommandant (Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade()=="CENTURION") {
			nouveauCommandant.parler("« Moi" + nouveauCommandant.getNom() + "je prends la direction du camp romain. ».");
			this.commandant=nouveauCommandant;
		} else {
			nouveauCommandant.parler("« Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ».");
		}
	}
}
