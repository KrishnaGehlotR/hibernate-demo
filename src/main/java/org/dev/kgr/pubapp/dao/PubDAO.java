package org.dev.kgr.pubapp.dao;

import org.dev.kgr.pubapp.dto.PubDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * The Class PubDAO.
 */
public class PubDAO {

	/**
	 * Save.
	 *
	 * @param pubDTO the pub DTO
	 */
	public void save(PubDTO pubDTO) {
		// Componet - 1
		Configuration config = new Configuration();
		config.configure();

		// Component - 2
		SessionFactory factory = config.buildSessionFactory();

		// Component - 3
		Session session = factory.openSession();

		// Component - 4
		Transaction transaction = session.beginTransaction();

		session.save(pubDTO);
		transaction.commit();
	}
}