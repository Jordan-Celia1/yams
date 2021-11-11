
public class Joueur {
	
	private String nom;
	private int score;
	
	public Joueur(String nom) {
		this.nom=nom;
		this.score=0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getScore() {
		return score;
	}
	
	public void ajouterPoints(int nbPoints) {
		this.score+=+nbPoints;
	}

}
