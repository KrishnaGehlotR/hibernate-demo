package org.dev.kgr.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Singleton design pattern for getting SessionFactory object.
 * 
 * @author Krishna
 */
public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		SESSION_FACTORY = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}
