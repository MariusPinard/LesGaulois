package personnages;

public class Soldat extends Romain{
	
	protected String grade;
	private int [] protections;
	
	public Soldat(String nom, int force, String grade) {
		super(nom, force);
		this.grade=grade;
		this.protections = new int [3] ;
		this.protections[0]=0;
		this.protections[1]=0;
		this.protections[2]=0;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public void donnerAuteur() {
		System.out.print(this.getGrade()+ "" +this.getNom());

	}
	
	public void equiper(String equipement) {
		if (equipement=="casque") {
			this.protections[0]=2;
			System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement +".");
		} else if (equipement=="plastron") {
			this.protections[1]=3;
			System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement +".");
		} else if (equipement=="bouclier") {
			this.protections [2] =3;
			System.out.println("Le soldat " + this.getNom() + " s'équipe avec un " + equipement +".");
		}
		
	}
	
	public int getProtection() {
		int protection = 0;
		for (int i=0 ; i<3 ; i++) {
			if (this.protections[i]!=0) {
				protection+=this.protections[i];
				if (i==0) {
					System.out.println("Le casque absorbe 2 du coup");
				} else if (i==1) {
					System.out.println("Le plastron absorbe 3 du coup");
				} else if (i==2) {
					System.out.println("Le bouclier absorbe 3 du coup");
				}
			}
		}
		return protection;
	}
	
	public void recevoirCoup(int forceCoup) {
		forceCoup=forceCoup - this.getProtection();
		
		if (forceCoup<0) forceCoup=0;
		if (this.force<=forceCoup) {
			this.force=0;
			this.parler(" J�abandonne� ");
		} else {
			this.force-=forceCoup;
			this.parler(" A�e ! ");
		}
	}
	
}