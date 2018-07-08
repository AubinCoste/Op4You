package fr.aubin.op4you.presentation;

import java.util.ArrayList;

import fr.aubin.op4you.domaine.OpCommerciale;
import fr.aubin.op4you.domaine.Youtuber;
import fr.aubin.op4you.service.OpCommercialeService;
import fr.aubin.op4you.service.YoutuberService;

public class Op4You {

	public static void main(String[] args) {

		// création de mes objets
		Youtuber youtuber1 = new Youtuber(1, "Coste", "Aubin", "Les petits loulous",
				"https://www.youtube.com/channel/UC2BLFKp2cHDmN0zKV1CHnhQ", 150000);
		Youtuber youtuber2 = new Youtuber(2, "Brognar", "Denis", "Oui",
				"https://www.youtube.com/channel/UC2BLFKp2cHDmN0zKV1CHnhQ", 200);
		Youtuber youtubeurTempo = null;

		OpCommerciale op1 = new OpCommerciale(1, "Drone 4k", "Maverick", 50.51, 120000);
		ArrayList<Youtuber> listeyt = new ArrayList<>();
		ArrayList<OpCommerciale> listeop = new ArrayList<>();

		// création de mes services
		YoutuberService ytservice = new YoutuberService();
		OpCommercialeService opservice = new OpCommercialeService();

		// ajout de youtubeurs
		// ytservice.ajouterYoutuber(youtuber1);
		// ytservice.ajouterYoutuber(youtuber2);

		// afficher le youtubeurs 1

		System.out.println("Voici le youtubeur pour l'id : 1");
		youtubeurTempo = ytservice.infosYoutuber(1);
		System.out.println("Nom : " + youtubeurTempo.getNom());
		System.out.println("Prénom : " + youtubeurTempo.getPrenom());
		System.out.println("Chaine : " + youtubeurTempo.getNomChaine());
		System.out.println("Abonnés : " + youtubeurTempo.getNbrAbonnes());
		System.out.println("-------------------------------");

		// afficher la liste d'abonnés
		listeyt = ytservice.getAll();
		for (Youtuber youtuber : listeyt) {
			System.out.println();
		}

		// essayer de participer à une op pour le premeir youtuber
		if (ytservice.participerOp(op1, youtuber1)) {
			System.out.println(youtuber1.getNom() + ", votre chaine : " + youtuber1.getNomChaine()
					+ " rempli les conditions de participation à l'opération commeciale " + op1.getNomOp()
					+ " votre demande de participation à donc été transmise.");
		}else {
			System.out.println("désolé vous ne remplissez pas les conditions de participation à cette opération commerciale.");
		}
		//et pour le deuxieme
		if (ytservice.participerOp(op1, youtuber2)) {
			System.out.println(youtuber1.getPrenom() + ", votre chaine " + youtuber1.getNomChaine()
					+ " rempli les conditions de participation à l'opération commeciale " + op1.getNomOp()
					+ ", votre demande de participation à donc été transmise.");
		}else {
			System.out.println("désolé vous ne remplissez pas les conditions de participation à cette opération commerciale.");
		}
		
		//lister les opérations commerciales
		listeop = opservice.getAll();
		for (OpCommerciale opCommerciale : listeop) {
			System.out.println(opCommerciale);
		}
	}

}
