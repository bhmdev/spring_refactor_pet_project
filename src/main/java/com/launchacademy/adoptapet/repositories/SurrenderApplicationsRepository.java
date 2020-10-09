package com.launchacademy.adoptapet.repositories;

import org.springframework.data.repository.CrudRepository;

public interface SurrenderApplicationsRepository extends CrudRepository<SurrenderApplicationsRepository, Integer> {
    public Iterable<SurrenderApplicationsRepository> findAll();
}
