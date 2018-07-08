package fr.aubin.op4you.service;

import java.util.ArrayList;

import fr.aubin.op4you.dao.Iyoutuber;
import fr.aubin.op4you.dao.YoutuberDAO;
import fr.aubin.op4you.domaine.OpCommerciale;
import fr.aubin.op4you.domaine.Youtuber;

public class YoutuberService {
	
	//créer un objet DAO
	Iyoutuber maDao = new YoutuberDAO();
	//créer un youtuber temporaire
	Youtuber yt = null;
	//créer une arraylist de youtuber
	ArrayList<Youtuber> maliste = new ArrayList<>();
	
	public void ajouterYoutuber(Youtuber monYoutuber) {
		maDao.ajouterYoutuber(monYoutuber);
	}
	
	public Youtuber infosYoutuber(int id) {
		yt = maDao.getYoutuber(id);
		return yt;
	}
	
	public ArrayList<Youtuber> getAll(){
		maliste = maDao.getAll();
		return maliste;
	}
	
	public boolean participerOp(OpCommerciale op, Youtuber yt) {
		boolean accepter = false;
		if(yt.getNbrAbonnes()>op.getNbrAbonnesMin()) {
			accepter = true;
		}
		return accepter;
	}
}
