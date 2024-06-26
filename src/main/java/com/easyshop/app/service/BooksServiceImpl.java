package com.easyshop.app.service;


import com.easyshop.app.models.Book;
import com.easyshop.app.repo.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {

	BooksRepository booksRepository;

	BooksServiceImpl(BooksRepository booksRepository){
		this.booksRepository = booksRepository;
	}

	@Override
	public Book addBook(Book book) {
        return booksRepository.save(Optional.ofNullable(book).orElseThrow(() -> new RuntimeException("Data not found"))) ;
	}

	@Override
	public Book findBook(Book book) {
		return null;
	}

	@Override
	public Book findBookById(int id) {
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		return null;
	}

	@Override
	public Book deleteBook(Book book) {
		return null;
	}

	@Override
	public Book findByAuthor(String name) {
		return booksRepository.findByAuthor(name);
	}
}
