package personnages;

public class Gaulois extends Personnage{
	private String nom;
	private int force;
	public Gaulois(String nom,int force) {
		super(nom,force);
	}
	
	/*public String getNom(){
		return this.nom;
	}
	*/
/*	public void parler(String texte) {
		System.out.println("Le gaulois " + this.nom + ": «" + texte + "».");
	}
	*/
	public void donnerAuteur () {
		System.out.print("Le gaulois ");
	}
	/*
	public void frapper(Romain romain) {
		System.out.println(this.nom + " envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(this.force/3);
	}
	*/
}