package org.mohamed.loanv2.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transactional;
import org.mohamed.loanv2.config.EntityManagerFactoryHolder;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.DemandeRepository;

import java.util.List;

public class DemandeRepositoryImpl implements DemandeRepository {

    EntityManager em = EntityManagerFactoryHolder.getEntityManagerFactory().createEntityManager();

    @Override
    @Transactional
    public void save(Demande demande) {
        EntityTransaction entitytransaction = em.getTransaction();
        try{
            entitytransaction.begin();
            em.persist(demande);
            entitytransaction.commit();
        } catch (Exception e) {
            if(entitytransaction.isActive()){
                entitytransaction.rollback();
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
