package com.bssm.service.impl;

import com.bssm.dao.BookDao;
import com.bssm.entity.Book;
import com.bssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bd;

    @Override
    public List<Book> queryBook(String title) {

        return bd.queryBook(title);
    }
}
