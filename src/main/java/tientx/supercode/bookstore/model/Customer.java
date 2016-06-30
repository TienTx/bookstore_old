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
public class Customer extends Person implements Serializable {

    protected Integer idCustomer;
    protected String sEmail;
    protected String sPhone;
    protected CardPoint cardPoint;

    public Customer() {
    }

    public Customer(Integer idCustomer, String sEmail, String sPhone, CardPoint cardPoint, Integer idPerson, String sFullName, String sAddress) {
        super(idPerson, sFullName, sAddress);
        this.idCustomer = idCustomer;
        this.sEmail = sEmail;
        this.sPhone = sPhone;
        this.cardPoint = cardPoint;
    }

    public Customer(Integer idCustomer, String sEmail, String sPhone, CardPoint cardPoint) {
        this.idCustomer = idCustomer;
        this.sEmail = sEmail;
        this.sPhone = sPhone;
        this.cardPoint = cardPoint;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public String getsEmail() {
        return sEmail;
    }

    public String getsPhone() {
        return sPhone;
    }

    public CardPoint getCardPoint() {
        return cardPoint;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public void setCardPoint(CardPoint cardPoint) {
        this.cardPoint = cardPoint;
    }

}
