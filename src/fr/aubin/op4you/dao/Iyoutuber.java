package fr.aubin.op4you.dao;

import java.util.ArrayList;

import fr.aubin.op4you.domaine.Youtuber;

public interface Iyoutuber {

	// methode ajout de youtuber
	void ajouterYoutuber(Youtuber pyoutuber);

	// methode pour récupérer les infos d'un youtuber depuis son id
	Youtuber getYoutuber(int idYoutuber);

	//methode pour récupérer tout les youtubers
	ArrayList<Youtuber> getAll();

}