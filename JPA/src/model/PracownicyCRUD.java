package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PracownicyCRUD {

	private EntityManagerFactory entityManagerFactory;
	
	PracownicyCRUD() {
		entityManagerFactory =
				Persistence.createEntityManagerFactory("JPA");
	}
	
	
	public void createPracownicy() {
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(pracownicy);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
@Override
public void finalize() {
entityManagerFactory.close();
}


}
	

