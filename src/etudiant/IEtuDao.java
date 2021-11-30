package etudiant;

import java.util.List;


public interface IEtuDao <T>{
	
	public void create(T object) ;
	public List<T> read();
	public void update(T object, int id);
	public void delete(int id);
	public List<T> findById(int id);
	public List<T> findByNom(String nom);

}
