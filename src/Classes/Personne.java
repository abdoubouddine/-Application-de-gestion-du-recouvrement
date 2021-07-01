package Classes;

public class Personne {

	protected String matricule,mail,nom,prenom;
	
	public Personne() {
		
	}
	
	public Personne(String mat,String m,String n,String p) {
		this.matricule = mat;
		this.mail = m;
		this.nom = n;
		this.prenom = p;
	}
	
	
	public Personne(String mat,String m, String n) {
		this.matricule = mat;
		this.mail = m;
		this.nom = n;
	}
	
	public String getMatricule() {
		return this.matricule;
	}
	public String getMail() {
		return this.mail;
	}
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setMatricule(String mat) {
		this.matricule = mat;
	}
	public void setMail(String m) {
		this.mail = m;
	}
	public void setNom(String n) {
		this.nom = n;
	}
	public void setPrenom(String p) {
		this.prenom = p;
	}

}
