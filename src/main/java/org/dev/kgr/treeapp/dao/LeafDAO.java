package org.dev.kgr.treeapp.dao;

import org.dev.kgr.treeapp.dto.LeafDTO;
import org.dev.kgr.utility.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LeafDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveLeaf(LeafDTO leafDTO) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(leafDTO);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
