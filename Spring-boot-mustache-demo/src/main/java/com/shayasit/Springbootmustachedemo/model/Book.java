package com.shayasit.Springbootmustachedemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long bookId;
    private String isbnNo;
    private String bookTitle;
    private String author;
    private Double price;
}
