package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom(){
		return this.nom;
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus.getNom());
	}
	
	public void parler(String texte) {
		System.out.println("Le romain " + this.nom + ": «" + texte + "».");
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