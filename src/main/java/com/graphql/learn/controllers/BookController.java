package com.graphql.learn.controllers;

import com.graphql.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    //create

//    @DgsMutation
//    @MutationMapping("createBook")
//    public Book create(@Argument BookInput book) {
//        Book b=new Book();
//        b.setTitle(book.getTitle());
//        b.setDesc(book.getDesc());
//        b.setPrice(book.getPrice());
//        b.setAuthor(book.getAuthor());
//        b.setPages(book.getPages());
//        return this.bookService.create(b);
//    }

    //get all

//    @DgsQuery
//    public List<Book> getAll() {
//        return this.bookService.getAll();
//    }

    //get single book
//    @DgsQuery
//    public Book get(@Argument int bookId) {
//        return this.bookService.get(bookId);
//    }

}

@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
