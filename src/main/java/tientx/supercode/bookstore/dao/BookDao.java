/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.dao;

import java.util.List;
import tientx.supercode.bookstore.model.Book;
import tientx.supercode.bookstore.model.Deals;

/**
 *
 * @author zOzDarKzOz
 */
public interface BookDao {

    public Book getById(Integer id);

    public List<Book> getByIdSubCategory(Integer id);

    public List<Book> getBySubCategoryName(String name);

    public List<Deals> getDealsById(Integer id);

    public Integer insert(Book book);

    public boolean update(Book book);

    public boolean delete(Integer id);

}
