package personnages;

public class Romain extends Personnage {
	private String nom;
	private int force;
	public Romain(String nom,int force) {
		super(nom,force);
	}
	
	/*public String getNom(){
		return this.nom;
	}
	*/
	/*
	public void parler(String texte) {
		System.out.println("Le romain " + this.nom + ": «" + texte + "».");
	}
	*/
	/*
	public void recevoirCoup(int force_coup) {
		if (this.force<=force_coup) {
			this.force=0;
			this.parler(" J’abandonne… ");
		} else {
			this.force-=force_coup;
			this.parler(" Aïe ! ");
		}
	}
	*/
	
	public void donnerAuteur() {
		System.out.println("Le romain ");
	}
}