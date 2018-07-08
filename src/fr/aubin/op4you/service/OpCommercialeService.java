package fr.aubin.op4you.service;

import java.util.ArrayList;

import fr.aubin.op4you.dao.IoperationCommerciale;
import fr.aubin.op4you.dao.OpCommercialeDAO;
import fr.aubin.op4you.domaine.OpCommerciale;

public class OpCommercialeService {

	//Op temporaire
	OpCommerciale opTemporaire = null;
	//Ma dao
	IoperationCommerciale maDao = new OpCommercialeDAO();
	
	public void ajouterOp(OpCommerciale monOp) {
		maDao.ajouterOP(monOp);
	}
	
	public OpCommerciale infosOp(int id) {
		opTemporaire = maDao.getOp(id);
		return opTemporaire;
	}
	
	public ArrayList<OpCommerciale> getAll(){
		ArrayList<OpCommerciale> listeOp = new ArrayList<>();
		listeOp = maDao.getAll();
		return listeOp;
	}
}
