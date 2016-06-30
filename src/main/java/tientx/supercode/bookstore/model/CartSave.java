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
public class CartSave implements Serializable {

    private Integer idCartSave;
    private Integer iBonus;
    private String sAmount;

    public CartSave() {
    }

    public CartSave(Integer idCartSave, Integer iBonus, String sAmount) {
        this.idCartSave = idCartSave;
        this.iBonus = iBonus;
        this.sAmount = sAmount;
    }

    public Integer getIdCartSave() {
        return idCartSave;
    }

    public Integer getiBonus() {
        return iBonus;
    }

    public String getsAmount() {
        return sAmount;
    }

    public void setIdCartSave(Integer idCartSave) {
        this.idCartSave = idCartSave;
    }

    public void setiBonus(Integer iBonus) {
        this.iBonus = iBonus;
    }

    public void setsAmount(String sAmount) {
        this.sAmount = sAmount;
    }

}
