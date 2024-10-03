package org.mohamed.loanv2.repository;

import org.mohamed.loanv2.entity.Demande;

import java.util.List;

public interface DemandeRepository {

    public void save(Demande demande);
    public Demande findById(Long id);
    public List<Demande> findAll();
    public void delete(Demande demande);
    public void update(Demande demande);

}
