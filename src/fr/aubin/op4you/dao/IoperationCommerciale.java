package fr.aubin.op4you.dao;

import java.util.ArrayList;

import fr.aubin.op4you.domaine.OpCommerciale;

public interface IoperationCommerciale {

	void ajouterOP(OpCommerciale op);

	OpCommerciale getOp(int id);

	ArrayList<OpCommerciale> getAll();

}