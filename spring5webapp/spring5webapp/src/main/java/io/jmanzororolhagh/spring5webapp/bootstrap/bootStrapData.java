package io.jmanzororolhagh.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.jmanzororolhagh.spring5webapp.model.Author;
import io.jmanzororolhagh.spring5webapp.model.Book;
import io.jmanzororolhagh.spring5webapp.model.Publisher;
import io.jmanzororolhagh.spring5webapp.repositories.AuthorRepository;
import io.jmanzororolhagh.spring5webapp.repositories.BookRepository;
import io.jmanzororolhagh.spring5webapp.repositories.PublisherRepository;

@Component
public class bootStrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public bootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    
    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Ivan");
        Book ddd = new Book("Domain Driven Design", "123456");
        Publisher lighthouse = new Publisher("Lighthouse Books", "123 Maple Rd");
        publisherRepository.save(lighthouse);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        Author steph = new Author("Stephen", "Hawking");
        Book tower = new Book("Tower of Mordor", "888888");
        steph.getBooks().add(tower);
        tower.getAuthors().add(steph);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        authorRepository.save(steph);
        bookRepository.save(tower);  
        tower.setPublisher(lighthouse);
        ddd.setPublisher(lighthouse);
        lighthouse.getBooks().add(tower);
        lighthouse.getBooks().add(ddd);
        
        System.out.println("Publishers: " + publisherRepository.count());
        System.out.println("Publisher #Books: " + lighthouse.getBooks());
    }
    
}