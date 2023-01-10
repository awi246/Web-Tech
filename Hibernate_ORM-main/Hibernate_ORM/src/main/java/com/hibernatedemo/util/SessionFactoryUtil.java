
package com.hibernatedemo.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatedemo.model.College;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFacotroy() {

		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

	
}