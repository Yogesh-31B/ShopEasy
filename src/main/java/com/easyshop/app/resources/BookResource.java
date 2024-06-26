package com.easyshop.app.resources;

import com.easyshop.app.models.Book;
import com.easyshop.app.service.BooksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookResource {

    BooksService  booksService;

    public BookResource(BooksService booksService) {
        this.booksService = booksService;
    }

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
       return  booksService.addBook(book);
    }

    @GetMapping("/find/{name}")
    public Book findByName(@PathVariable String name){

        return booksService.findByAuthor(name);
    }
}
