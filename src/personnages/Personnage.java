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
		System.out.println(" : «" + texte + "».");
	}
	
	protected abstract void donnerAuteur();
	

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
			System.out.println(adversaire.getNom() + " a abandonné");
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		if (this.force<=forceCoup) {
			this.force=0;
			this.parler(" J’abandonne… ");
		} else {
			this.force-=forceCoup;
			this.parler(" Aïe ! ");
		}
	}
}