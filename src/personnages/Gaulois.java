package personnages;

public class Gaulois {
	private String nom;
	private int force;
	public Gaulois(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom(){
		return this.nom;
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	
	public void parler(String texte) {
		System.out.println("Le gaulois " + this.nom + ": «" + texte + "».");
	}
	
	public void frapper(Romain romain) {
		System.out.println(this.nom + " envoie un grand coup dans la mâchoire de "+romain.getNom());
		romain.recevoirCoup(this.force/3);
	}
}