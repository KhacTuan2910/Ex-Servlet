package cybersoft.javabackend.java14.hibernatejpa.repository;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java14.hibernatejpa.model.App;

@Repository
public class AppRepositoryImpl implements AppRepository {
	private SessionFactory sessionFactory;
	
	public AppRepositoryImpl(SessionFactory sf) {
		sessionFactory = sf;
	}
		
	@Override
	public App create(App app) {
		org.hibernate.Session session = sessionFactory.openSession();
		
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			// do Stuff
			session.saveOrUpdate(app);
			
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			session.close();
		}
		return app;
	}
	
}
