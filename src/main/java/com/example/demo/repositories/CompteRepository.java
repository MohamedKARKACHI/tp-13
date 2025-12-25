package com.example.demo.repositories;

import com.example.demo.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour la gestion des comptes
 */
@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
