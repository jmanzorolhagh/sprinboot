package io.jmanzororolhagh.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import io.jmanzororolhagh.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{
    
}
