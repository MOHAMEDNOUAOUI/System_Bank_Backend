import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;

public class main {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerFactoryHolder.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Demande demande = new Demande();
        demande.setEmail("mohamednouaoui5@gmail.com");
        demande.setTelephone("+212653989456");
        demande.setMensualite(53000);

        entityManager.persist(demande);
        entityTransaction.commit();

        entityManager.close();
        EntityManagerFactoryHolder.getEntityManager();
    }
}
