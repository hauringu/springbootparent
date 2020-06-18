package com.bssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.bssm.entity.Book;
import com.bssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bs;

    @ResponseBody
    @RequestMapping(value="/queryBook",produces="application/json;charset=utf-8")
    public String queryBook(String title) {

        if (title == null || title.isEmpty())
            title = "";
        List<Book> book = bs.queryBook(title);
        String bookStr = JSONObject.toJSONString(book);
        return bookStr;

    }

}
