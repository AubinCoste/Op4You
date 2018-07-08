package fr.aubin.op4you.domaine;

public class OpCommerciale {

	//attributs
	private int idOp;
	private String nomOp;
	private String marqueOp;
	private double montantOp;
	private int nbrAbonnesMin;
	
	//constructeur
	public OpCommerciale(int idOp, String nomOp, String marqueOp, double montantOp, int nbrAbonnesMin) {
		super();
		this.idOp = idOp;
		this.nomOp = nomOp;
		this.marqueOp = marqueOp;
		this.montantOp = montantOp;
		this.nbrAbonnesMin = nbrAbonnesMin;
	}

	//getters et setters
	public int getIdOp() {
		return idOp;
	}

	public void setIdOp(int idOp) {
		this.idOp = idOp;
	}

	public String getNomOp() {
		return nomOp;
	}

	public void setNomOp(String nomOp) {
		this.nomOp = nomOp;
	}

	public String getMarqueOp() {
		return marqueOp;
	}

	public void setMarqueOp(String marqueOp) {
		this.marqueOp = marqueOp;
	}

	public double getMontantOp() {
		return montantOp;
	}

	public void setMontantOp(double montantOp) {
		this.montantOp = montantOp;
	}

	public int getNbrAbonnesMin() {
		return nbrAbonnesMin;
	}

	public void setNbrAbonnesMin(int nbrAbonnesMin) {
		this.nbrAbonnesMin = nbrAbonnesMin;
	}

	@Override
	public String toString() {
		return "OpCommerciale [idOp=" + idOp + ", nomOp=" + nomOp + ", marqueOp=" + marqueOp + ", montantOp="
				+ montantOp + ", nbrAbonnesMin=" + nbrAbonnesMin + "]";
	}
	
	
	
}
