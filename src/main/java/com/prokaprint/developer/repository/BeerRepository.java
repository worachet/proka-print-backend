package com.prokaprint.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prokaprint.developer.model.Beer;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}
