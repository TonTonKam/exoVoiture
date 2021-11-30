package etudiant;

import java.sql.Connection;

import Dao.Connexion;

public abstract class HeritageConnect {
	
	//attributs
	Connection connect = Connexion.getConnexion();

}
