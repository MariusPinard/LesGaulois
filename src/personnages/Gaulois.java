package personnages;

public class Gaulois extends Personnage{
	
	protected int boost=1;
	
	public Gaulois(String nom,int force) {
		this.force=force;
		this.nom=nom;
	}
	
	public void donnerAuteur () {
		System.out.print(" gaulois "+ this.getNom());
	}
	
	public void boostGaulois (int forcePotion) {
		this.boost=forcePotion;
	}
	
	public int getBoost() {
		return this.boost;
	}
	
	public void frapper(Personnage adversaire) {
		if (adversaire.force>0) {
			System.out.println(this.force);
			System.out.println();

			int forceCoup=this.force*this.boost/3;
			System.out.print("Le");
			this.donnerAuteur();
			System.out.print(" envoie un grand coup de force " + forceCoup);
			adversaire.donnerAuteur();
			System.out.println(".");
			adversaire.recevoirCoup(forceCoup);
			if (this.boost!=1) {
				this.boost-=0.5;
			}
		} else {
			System.out.println(adversaire.getNom() + " a abandonn�");
		}
	}
}