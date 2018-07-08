package fr.aubin.op4you.domaine;

public class Youtuber {
	
	//attributs
	private int id;
	private String nom;
	private String prenom;
	private String nomChaine;
	private String lienChaine;
	private int nbrAbonnes;
	
	//constructeur
	public Youtuber(int id, String nom, String prenom, String nomChaine, String lienChaine, int nbrAbonnes) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nomChaine = nomChaine;
		this.lienChaine = lienChaine;
		this.nbrAbonnes = nbrAbonnes;
	}

	//getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getNomChaine() {
		return nomChaine;
	}

	public void setNomChaine(String nomChaine) {
		this.nomChaine = nomChaine;
	}

	public String getLienChaine() {
		return lienChaine;
	}

	public void setLienChaine(String lienChaine) {
		this.lienChaine = lienChaine;
	}

	public int getNbrAbonnes() {
		return nbrAbonnes;
	}

	public void setNbrAbonnes(int nbrAbonnes) {
		this.nbrAbonnes = nbrAbonnes;
	}

	@Override
	public String toString() {
		return "Youtuber [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nomChaine=" + nomChaine
				+ ", lienChaine=" + lienChaine + ", nbrAbonnes=" + nbrAbonnes + "]";
	}
	
	
	
	
}
