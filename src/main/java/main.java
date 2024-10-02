import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryHolder.getEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Demande demande = new Demande();
        demande.setEmail("anassnakhli@gmail.com");

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

}
