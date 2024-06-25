package com.easyshop.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easyshop.app.models.Book;
import org.springframework.stereotype.Repository;

public interface BooksRepository extends JpaRepository<Book, Integer> {

}
