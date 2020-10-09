package com.launchacademy.adoptapet.repositories;

import com.launchacademy.adoptapet.models.SurrenderApplication;
import org.springframework.data.repository.CrudRepository;

public interface SurrenderApplicationsRepository extends CrudRepository<SurrenderApplication, Integer> {
    public Iterable<SurrenderApplication> findAll();
}
