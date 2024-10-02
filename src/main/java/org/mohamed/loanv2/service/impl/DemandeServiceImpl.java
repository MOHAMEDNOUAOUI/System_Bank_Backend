package org.mohamed.loanv2.service.impl;

import jakarta.transaction.Transactional;
import org.mohamed.loanv2.entity.Demande;
import org.mohamed.loanv2.repository.impl.DemandeRepositoryImpl;
import org.mohamed.loanv2.service.DemandeService;

public class DemandeServiceImpl implements DemandeService {

    private final DemandeRepositoryImpl demandeRepository;

    public DemandeServiceImpl() {
        this.demandeRepository = new DemandeRepositoryImpl();
    }

    @Override
    @Transactional
    public void createDemande(Demande demande) {
         demandeRepository.save(demande);
    }

}
