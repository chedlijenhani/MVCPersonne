package iset.mvcpersonne.modele;

public class Personne {
 
	
	
	public Personne(String nom, String prenom ,String sexe ,String code) {
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.code=code;
		// TODO Auto-generated constructor stub
	}
	private String nom ;
	private String prenom ;
	private String sexe ;
	private String code ;
	
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
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
