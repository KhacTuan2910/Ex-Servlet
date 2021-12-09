package cybersoft.javabackend.java14.hibernatejpa.repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;
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

	@Override
	public List<App> findAll() {
		Session session = sessionFactory.openSession();
		Query<App> query = session.createQuery("FROM App", App.class);
		
		return query.getResultList();
	}

	@Override
	public App findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(App.class, id);
	}
	
}
