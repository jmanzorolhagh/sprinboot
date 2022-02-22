package io.jmanzororolhagh.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import io.jmanzororolhagh.spring5webapp.model.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
