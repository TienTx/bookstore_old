/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.service;

import java.util.List;
import tientx.supercode.bookstore.dao.BookDao;
import tientx.supercode.bookstore.dao.BookDaoImpl;
import tientx.supercode.bookstore.model.Book;

/**
 *
 * @author zOzDarKzOz
 */
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl() {
        this.bookDao = new BookDaoImpl();
    }

    @Override
    public Book findById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> findByIdSubCategory(Integer id) {
        return bookDao.getByIdSubCategory(id);
    }

    @Override
    public List<Book> findBySubCategoryName(String name) {
        return bookDao.getBySubCategoryName(name);
    }

    @Override
    public Integer add(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public boolean edit(Book book) {
        return bookDao.update(book);
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id);
    }

}
