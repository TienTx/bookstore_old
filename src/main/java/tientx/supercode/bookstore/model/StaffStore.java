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
public class StaffStore extends Employee implements Serializable {

    public StaffStore(Integer idEmployee, String sAccount, String sPassword, String sEmail, String sPhone, Date createDate, String sPosition, Integer idPerson, String sFullName, String sAddress) {
        super(idEmployee, sAccount, sPassword, sEmail, sPhone, createDate, sPosition, idPerson, sFullName, sAddress);
    }

    public StaffStore(Integer idEmployee, String sAccount, String sPassword, String sEmail, String sPhone, Date createDate, String sPosition) {
        super(idEmployee, sAccount, sPassword, sEmail, sPhone, createDate, sPosition);
    }

    public StaffStore() {
    }

}
