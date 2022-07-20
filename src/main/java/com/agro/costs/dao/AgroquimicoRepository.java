package com.agro.costs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgroquimicoRepository extends JpaRepository<AgroquimicoDao, Integer> {
}
