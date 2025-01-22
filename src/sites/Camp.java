package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Camp {
	protected Soldat commandant;
	protected Soldat l_soldats[];
	int nbSoldats;
	
	public Camp (Soldat commandant, Soldat l_soldats[], int nbSoldats) {
		this.commandant=commandant;
		this.l_soldats[0]=commandant;
		this.nbSoldats=1;
	}
	
	public Soldat getCommandant() {
		return this.commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (this.nbSoldats==4) {
			this.commandant.parler("Désolé" + soldat.getNom() + "notre camp est complet !");
		} else {
			this.l_soldats[nbSoldats]=soldat;
			this.nbSoldats+=1;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par" + this.commandant);
		}
	}
}
