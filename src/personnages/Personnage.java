package personnages;

public class abstract Personnage {

	private String nom;
	private int force;
	public Personnage(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void parler(String texte) {
		this.donnerAuteur();
		System.out.println(this.nom + " : «" + texte + "».");
	}
	
	protected void abstract donnerAuteur() {
		this.donnerAuteur();
	}
	
	public void frapper(Personnage adversaire) {
		this.donnerAuteur();
		System.out.print(this.nom + " envoie un grand coup dans la mâchoire de ");
		adversaire.donnerAuteur();
		System.out.println(adversaire.getNom());
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