package com.shayasit.Springbootmustachedemo.controller;

import com.shayasit.Springbootmustachedemo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getBook(Model model) {
        List bookList = IntStream.range(0, 6)
                .mapToObj(i -> getBook(i))
                .collect(Collectors.toList());

        model.addAttribute("bookList", bookList);
        return "book";
    }

    private Book getBook(int i) {
        return new Book(Long.valueOf(i), "ISBN Number - " + i, "Book Name - " + i, "Author - "+ i, Double.valueOf(100 * i));
    }
}
