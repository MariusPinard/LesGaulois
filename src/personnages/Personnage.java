package personnages;

public abstract class Personnage {
	
	protected int force;
	protected String nom;

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
		System.out.print("Le");
		this.donnerAuteur();
		System.out.print(" envoie un grand coup dans la mâchoire du ");
		adversaire.donnerAuteur();
		System.out.println(".");
		adversaire.recevoirCoup(this.force/3);
	}
	
	public void recevoirCoup(int force_coup) {
		if (this.force<=force_coup) {
			this.force=0;
			this.parler(" J’abandonne… ");
		} else {
			this.force-=force_coup;
			this.parler(" Aïe ! ");
		}
	}
}