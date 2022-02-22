package io.jmanzororolhagh.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.jmanzororolhagh.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {

    private final BookRepository bookRepository;
    

    @RequestMapping("/books")
    public String getBooks(){
        return "books:";
    }
    
    
}
