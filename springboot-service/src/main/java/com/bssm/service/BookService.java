package com.bssm.service;

import com.bssm.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> queryBook(String title);
}
