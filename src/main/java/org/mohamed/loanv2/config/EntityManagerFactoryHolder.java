package org.mohamed.loanv2.config;

import jakarta.persistence.Persistence;

import jakarta.persistence.EntityManagerFactory;

public class EntityManagerFactoryHolder {

    private static final EntityManagerFactory entityManagerFactory;


    static{
        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("BANK_PU");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static EntityManagerFactory getEntityManagerFactory() {
            if (entityManagerFactory == null) {
                throw new RuntimeException("No EntityManagerFactory found");
            }
            return entityManagerFactory;
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

}
