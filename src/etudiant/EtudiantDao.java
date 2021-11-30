package etudiant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDao extends HeritageConnect implements IEtuDao<Etudiant>{

	@Override
	public void create(Etudiant object) {
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO etudiant (nom, prenom) VALUES (?,?)");
			sql.setString(1, object.getNom());
			sql.setString(2, object.getPrenom());
			sql.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Etudiant> read() {
		ArrayList<Etudiant> listEtudiant = new ArrayList();
		ResultSet rs = null;
		try {
			PreparedStatement sql = connect.prepareStatement("SELECT * FROM etudiant");
			rs = sql.executeQuery();
			while(rs.next()) {
				listEtudiant.add(new Etudiant(rs.getString("nom"), rs.getString("prenom")));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listEtudiant;
	}

	@Override
	public void update(Etudiant object, int id) {
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("UPDATE etudiant SET nom =?, prenom= ? WHERE id =?");
			sql.setString(1, object.getNom());
			sql.setString(2, object.getPrenom());
			sql.setInt(3, id);
			sql.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//surcharge pour l'exercice
	public void update(String nom, String prenom, int id) {
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("UPDATE etudiant SET nom =?, prenom= ? WHERE id =?");
			sql.setString(1, nom);
			sql.setString(2, prenom);
			sql.setInt(3, id);
			sql.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("DELETE FROM etudiant WHERE id =?");
			sql.setInt(1, id);
			sql.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Etudiant> findById(int id) {
		ArrayList<Etudiant> listId = new ArrayList();
		ResultSet rs = null;
		
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("SELECT nom, prenom FROM etudiant WHERE id = ?");
			sql.setInt(1, id);
			rs = sql.executeQuery();
			while(rs.next()) {
				listId.add(new Etudiant(rs.getString("nom"), rs.getString("prenom")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listId;
	}
	
	//pour l'exercice
	public Etudiant findByEtuId(int id) {
		ResultSet rs = null;
		PreparedStatement sql;
		Etudiant etudiant = null;
		try {
			sql = connect.prepareStatement("SELECT nom, prenom FROM etudiant WHERE id = ?");
			sql.setInt(1, id);
			rs = sql.executeQuery();
			while(rs.next()) {
				etudiant = new Etudiant(rs.getString("nom"), rs.getString("prenom"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return etudiant;
	}

	@Override
	public List<Etudiant> findByNom(String nom) {
		ArrayList<Etudiant> listNom = new ArrayList();
		ResultSet rs = null;
		
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("SELECT id, nom, prenom FROM etudiant WHERE nom= ?");
			sql.setString(1, nom);
			rs = sql.executeQuery();
			while(rs.next()) {
				listNom.add(new Etudiant(rs.getString("nom"), rs.getString("prenom"), rs.getInt("id")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNom;
	}
	
	//pour l'exercice
	public int findByEtuNom(String nom) {
		int id = 0;
		ResultSet rs = null;
		
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("SELECT id FROM etudiant WHERE nom= ?");
			sql.setString(1, nom);
			rs = sql.executeQuery();
			while(rs.next()) {
				id = rs.getInt("id");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return id;
	}


}
