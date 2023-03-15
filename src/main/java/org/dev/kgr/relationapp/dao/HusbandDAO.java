package org.dev.kgr.relationapp.dao;

import org.dev.kgr.relationapp.dto.HusbandDTO;
import org.dev.kgr.utility.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HusbandDAO {

	private SessionFactory factory = HibernateUtil.getSessionFactory();

	public void saveWife(HusbandDTO husbandDTO) {
		Session session = null;
		Transaction transaction = null;

		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			session.save(husbandDTO);
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
