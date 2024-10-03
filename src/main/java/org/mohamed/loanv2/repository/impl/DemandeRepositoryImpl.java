package org.mohamed.loanv2.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transactional;
import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.DemandeRepository;

import java.util.List;

public class DemandeRepositoryImpl implements DemandeRepository {

    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(Demande demande) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            em.persist(demande);
            tx.commit();
        } catch (Exception e) {
            if(tx.isActive()){
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    @Override
    public Demande findById(Long id) {
        return null;
    }

    @Override
    public List<Demande> findAll() {
        return List.of();
    }

    @Override
    public void delete(Demande demande) {

    }

    @Override
    public void update(Demande demande) {

    }
}
