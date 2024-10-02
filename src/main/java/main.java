import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory emf = EntityManagerFactoryHolder.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Demande demande = new Demande();
        demande.setNom("mohamed");
        em.persist(demande);
        em.getTransaction().commit();
        em.close();
    }
}
