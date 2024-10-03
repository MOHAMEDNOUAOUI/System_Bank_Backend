package org.mohamed.loanv2.service.impl;

import jakarta.transaction.Transactional;
import org.hibernate.service.spi.InjectService;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.DemandeRepository;
import org.mohamed.loanv2.repository.impl.DemandeRepositoryImpl;
import org.mohamed.loanv2.service.DemandeService;


public class DemandeServiceImpl implements DemandeService {

    private DemandeRepository repo;
    public DemandeServiceImpl() {
        DemandeRepository repo = new DemandeRepositoryImpl();
    }


    @Override
    @Transactional
    public void createDemande(Demande demande) {
         repo.save(demande);
    }

}
