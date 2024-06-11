package com.easyshop.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyshop.app.models.Book;

public interface BooksRepository extends JpaRepository<Book, Integer> {

}
