package personnages;

public class Romain extends Personnage {
	
	public Romain(String nom,int force) {
		this.force=force;
		this.nom=nom;
	}
	
	/*public String getNom(){
		return this.nom;
	}
	*/
	/*
	public void parler(String texte) {
		System.out.println("Le romain " + this.nom + ": �" + texte + "�.");
	}
	*/
	/*
	public void recevoirCoup(int force_coup) {
		if (this.force<=force_coup) {
			this.force=0;
			this.parler(" J�abandonne� ");
		} else {
			this.force-=force_coup;
			this.parler(" A�e ! ");
		}
	}
	*/
	
	public void donnerAuteur() {
		System.out.print(" romain "+this.getNom());
	}
	
	
}
