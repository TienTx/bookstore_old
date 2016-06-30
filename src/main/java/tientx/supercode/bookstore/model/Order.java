/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author zOzDarKzOz
 */
public class Order implements Serializable {

    private Integer idOrder;
    private String sAddShipping;
    private Date createDate;
    private Date shipDate;
    private String sState;
    private Customer customer;
    private CartSave cartSave;

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public void setsAddShipping(String sAddShipping) {
        this.sAddShipping = sAddShipping;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public void setsState(String sState) {
        this.sState = sState;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCartSave(CartSave cartSave) {
        this.cartSave = cartSave;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public String getsAddShipping() {
        return sAddShipping;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public String getsState() {
        return sState;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CartSave getCartSave() {
        return cartSave;
    }

    public Order(Integer idOrder, String sAddShipping, Date createDate, Date shipDate, String sState, Customer customer, CartSave cartSave) {
        this.idOrder = idOrder;
        this.sAddShipping = sAddShipping;
        this.createDate = createDate;
        this.shipDate = shipDate;
        this.sState = sState;
        this.customer = customer;
        this.cartSave = cartSave;
    }

    public Order() {
    }
}
