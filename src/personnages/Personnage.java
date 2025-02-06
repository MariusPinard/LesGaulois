package personnages;

public abstract class Personnage {
	
	protected int force;
	protected String nom;
	protected int boost=1;

	public String getNom() {
		return this.nom;
	}
	
	public void parler(String texte) {
		System.out.print("Le");
		this.donnerAuteur();
		System.out.println(" : �" + texte + "�.");
	}
	
	protected abstract void donnerAuteur();
	

	public void frapper(Personnage adversaire) {
		if (adversaire.aTerre()) {
			System.out.println(adversaire.getNom() + " a abandonn�");
		} else if (this.aTerre()) {
			System.out.println(this.getNom() + " a abandonn�");
		}
			else {
			
			//System.out.println(this.force);
			int forceCoup = this.force;
			System.out.println();
			
			System.out.print("Le");
			this.donnerAuteur();
			System.out.print(" envoie un grand coup de force " + forceCoup);
			adversaire.donnerAuteur();
			System.out.println(".");
			adversaire.recevoirCoup(forceCoup);
			if (this.boost!=1) {
				this.boost-=0.5;
			}
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		if (this.force<=forceCoup) {
			this.force=0;
			this.parler(" J�abandonne� ");
		} else {
			this.force-=forceCoup;
			this.parler(" A�e ! ");
		}
	}
	
	public boolean aTerre() {
		return this.force<=0;
	}
}