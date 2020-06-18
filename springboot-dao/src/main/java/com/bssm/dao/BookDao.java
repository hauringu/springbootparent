package com.bssm.dao;

import com.bssm.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookDao {
    List<Book> queryBook(String title);
}
