package com.easyshop.app.service;

import com.easyshop.app.beans.BookBean;

public interface BooksService {

	BookBean addBook(BookBean bookBean);

	BookBean findBook(BookBean bookBean);

	BookBean findBookById(BookBean bookBean);

	BookBean updateBook(BookBean bookBean);

	BookBean deleteBook(BookBean bookBean);

}
