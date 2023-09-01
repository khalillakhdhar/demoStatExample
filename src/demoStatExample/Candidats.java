package demoStatExample;

public class Candidats {
// liste des membres de la formation java sp ng
	public static int id=0;
	private String nom,prenom;
	private String tel;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Candidats(String nom, String prenom, String tel) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Candidats [nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + "]";
	}
	
}
