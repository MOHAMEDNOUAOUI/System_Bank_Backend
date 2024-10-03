package org.mohamed.loanv2.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryHolder {

    private static final EntityManagerFactory entityManagerFactory;

    static {
        try{
            entityManagerFactory = Persistence.createEntityManagerFactory("simulation");;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    //toget the entitymanager
    public static EntityManager getEntityManager() {
        if(entityManagerFactory == null){
            throw new IllegalStateException("EntityManagerFactory has not been initialized");
        }
        return entityManagerFactory.createEntityManager();
    }


    //to close the entitymanager
    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

}
