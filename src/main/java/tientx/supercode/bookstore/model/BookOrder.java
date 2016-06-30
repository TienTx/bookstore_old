/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.model;

import java.io.Serializable;

/**
 *
 * @author zOzDarKzOz
 */
public class BookOrder implements Serializable {

    private Integer idBookOrder;
    private Integer iQuantity;
    private String sTotalPrice;
    private CartSave cartSave;
    private Book book;

    public void setIdBookOrder(Integer idBookOrder) {
        this.idBookOrder = idBookOrder;
    }

    public void setiQuantity(Integer iQuantity) {
        this.iQuantity = iQuantity;
    }

    public void setsTotalPrice(String sTotalPrice) {
        this.sTotalPrice = sTotalPrice;
    }

    public void setCartSave(CartSave cartSave) {
        this.cartSave = cartSave;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getIdBookOrder() {
        return idBookOrder;
    }

    public Integer getiQuantity() {
        return iQuantity;
    }

    public String getsTotalPrice() {
        return sTotalPrice;
    }

    public CartSave getCartSave() {
        return cartSave;
    }

    public Book getBook() {
        return book;
    }

    public BookOrder(Integer idBookOrder, Integer iQuantity, String sTotalPrice, CartSave cartSave, Book book) {
        this.idBookOrder = idBookOrder;
        this.iQuantity = iQuantity;
        this.sTotalPrice = sTotalPrice;
        this.cartSave = cartSave;
        this.book = book;
    }

    public BookOrder() {
    }
}
