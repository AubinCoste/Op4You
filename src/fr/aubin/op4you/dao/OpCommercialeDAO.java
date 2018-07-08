package fr.aubin.op4you.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.aubin.op4you.domaine.OpCommerciale;

public class OpCommercialeDAO implements IoperationCommerciale {

	// créer un objet de ConnectionBDD
	ConnectionBDD myconnection = new ConnectionBDD();
	// créer un objet opcommerciale
	OpCommerciale opC = null;

	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.IoperationCommerciale#ajouterOP(fr.aubin.op4you.domaine.OpCommerciale)
	 */
	@Override
	public void ajouterOP(OpCommerciale op) {

		// définir requete
		String requete = "INSERT INTO opcommerciales VALUES ('" + op.getIdOp() + "','" + op.getNomOp() + "','"
				+ op.getMarqueOp() + "','" + op.getMontantOp() + "','" + op.getNbrAbonnesMin() + "')";

		//se connecter
		myconnection.seConnecter();
		//executer la requete
		myconnection.updateData(requete);
		//fermer la connection
		myconnection.closeConnection();
	}
	
	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.IoperationCommerciale#getOp(int)
	 */
	@Override
	public OpCommerciale getOp(int id) {
		//définir requete
		String requete = "SELECT idOp,nomOp,marqueOp,montantOp,nbrAbonnesMin FROM opcommerciales WHERE idOp="+id;
		
		//se connecter
		myconnection.seConnecter();
		
		//prendre le resultat
		ResultSet rs = myconnection.executeRequete(requete);
		
		try {
			while(rs.next()) {
				int idOp = rs.getInt("idOp");
				String nom = rs.getString("nomOp");
				String marqueOp = rs.getString("marqueOp");
				double montant = rs.getDouble("montantOp");
				int aboMin = rs.getInt("nbrAbonnesMin");
				
				opC = new OpCommerciale(idOp, nom, marqueOp, montant, aboMin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		myconnection.closeConnection();
		return opC;
	}
	
	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.IoperationCommerciale#getAll()
	 */
	@Override
	public ArrayList<OpCommerciale> getAll(){
		//créer une arraylist
		ArrayList<OpCommerciale> malisteOp = new ArrayList<>();
		
		//définir la requete
		String requete = "SELECT idOp,nomOp,marqueOp,montantOp,nbrAbonnesMin FROM opcommerciales";
		
		//se connecter
		myconnection.seConnecter();
		
		//prendre le resultat
		ResultSet rs = myconnection.executeRequete(requete);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("idOp");
				String nom = rs.getString("nomOp");
				String marque = rs.getString("marqueOp");
				double montant = rs.getDouble("montantOp");
				int abosMin = rs.getInt("nbrAbonnesMin");
				
				opC = new OpCommerciale(id, nom, marque, montant, abosMin);
				malisteOp.add(opC);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		myconnection.closeConnection();
		return malisteOp;
	}
}
