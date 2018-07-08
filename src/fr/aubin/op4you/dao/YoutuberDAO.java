package fr.aubin.op4you.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.aubin.op4you.domaine.Youtuber;

public class YoutuberDAO implements Iyoutuber {

	// cr�er un objet de ConnectionBDD
	ConnectionBDD myconnection = new ConnectionBDD();
	// cr�er un youtuebr temporaire
	Youtuber youtuberTemporaire = null;

	// methode ajout de youtuber
	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.Iyoutuber#ajouterYoutuber(fr.aubin.op4you.domaine.Youtuber)
	 */
	@Override
	public void ajouterYoutuber(Youtuber pyoutuber) {

		// d�finir la requete
		String requete = "INSERT INTO youtuber VALUES ('" + pyoutuber.getId() + "','" + pyoutuber.getNom() + "','"
				+ pyoutuber.getPrenom() + "','" + pyoutuber.getNomChaine() + "','" + pyoutuber.getLienChaine() + "','"
				+ pyoutuber.getNbrAbonnes() + "')";

		// me connecter � la BDD
		myconnection.seConnecter();
		// executer la requete
		myconnection.updateData(requete);
		// lib�rer de la m�moire
		myconnection.closeConnection();
	}

	// methode pour r�cup�rer les infos d'un youtuber depuis son id
	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.Iyoutuber#getYoutuber(int)
	 */
	@Override
	public Youtuber getYoutuber(int idYoutuber) {

		// d�finir la requete
		String requete = "SELECT idYoutuber,nom,prenom,nomChaine,lienChaine,nbrAbonnes FROM youtuber WHERE idYoutuber="
				+ idYoutuber;

		// me connecter � la BDD
		myconnection.seConnecter();

		ResultSet results = myconnection.executeRequete(requete);
		
		try {
			while (results.next()) {
				int id = results.getInt("idYoutuber");
				String nom = results.getString("nom");
				String prenom = results.getString("prenom");
				String nomChaine = results.getString("nomChaine");
				String lienChaine = results.getString("lienChaine");
				int nbrAbos = results.getInt("nbrAbonnes");
				
				youtuberTemporaire = new Youtuber(id, nom, prenom, nomChaine, lienChaine, nbrAbos);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//fermer la connection
		myconnection.closeConnection();
		return youtuberTemporaire;
		
	}
	
	//methode pour r�cup�rer tout les youtubers
	/* (non-Javadoc)
	 * @see fr.aubin.op4you.dao.Iyoutuber#getAll()
	 */
	@Override
	public ArrayList<Youtuber> getAll(){
		ArrayList<Youtuber> listeYt = new ArrayList<>();
		
		//d�finir la requete
		String requete = "SELECT idYoutuber,nom,prenom,nomChaine,lienChaine,nbrAbonnes FROM youtuber";
		
		//se connecter
		myconnection.seConnecter();
		
		ResultSet rs = myconnection.executeRequete(requete);
		
		try {
			while (rs.next()) {
				int id = rs.getInt("idYoutuber");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String nomChaine = rs.getString("nomChaine");
				String lienChaine = rs.getString("lienChaine");
				int nbrAbos = rs.getInt("nbrAbonnes");
				
				youtuberTemporaire = new Youtuber(id, nom, prenom, nomChaine, lienChaine, nbrAbos);
				listeYt.add(youtuberTemporaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//fermer la connection
		myconnection.closeConnection();
		//retourner la liste
		return listeYt;
	}
}
