/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.service;

import java.util.List;
import tientx.supercode.bookstore.model.Book;

/**
 *
 * @author zOzDarKzOz
 */
public interface BookService {

    public Book findById(Integer id);

    public List<Book> findByIdSubCategory(Integer id);

    public List<Book> findBySubCategoryName(String name);

    public Integer add(Book book);

    public boolean edit(Book book);

    public boolean delete(Integer id);

}
