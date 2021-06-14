package com.training.org;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil
{



    private static  SessionFactory sessionFactory=configureSessionFactory();
    private static ServiceRegistry serviceRegistry;


    private static SessionFactory configureSessionFactory() throws HibernateException {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}