package guru.spring.framework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.spring.framework.spring5webapp.repository.BookRepository;

import org.springframework.ui.Model;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    
    // map this controller to a specific url
    @RequestMapping("/books")
    public String getBooks(Model model){
        // this is what is returned to the view - a copy of the model
        // we want to enhance model with a list of books
        model.addAttribute("books", bookRepository.findAll());
        // at runtime, when spring gets request it will execute getBooks method and provide
        // model object and we will provide model the books 
        // model returned with attribute with book and list of books which can be utilized
        return "books";
    }
}
