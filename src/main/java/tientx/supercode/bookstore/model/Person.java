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
public class Person implements Serializable {

    protected Integer idPerson;
    protected String sFullName;
    protected String sAddress;

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public void setsFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public String getsFullName() {
        return sFullName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public Person(Integer idPerson, String sFullName, String sAddress) {
        this.idPerson = idPerson;
        this.sFullName = sFullName;
        this.sAddress = sAddress;
    }

    public Person() {
    }
}
