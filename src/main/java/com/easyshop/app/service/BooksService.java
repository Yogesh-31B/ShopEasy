package com.easyshop.app.service;

import com.easyshop.app.models.Book;

public interface BooksService {

	Book addBook(Book book);

	Book findBook(Book book);

	Book findBookById(int id);

	Book updateBook(Book book);

	Book deleteBook(Book book);

	Book findByAuthor(String name);

}
