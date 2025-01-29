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
}