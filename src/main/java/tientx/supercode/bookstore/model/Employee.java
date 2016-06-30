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
public class Employee extends Person implements Serializable {

    protected Integer idEmployee;
    protected String sAccount;
    protected String sPassword;
    protected String sEmail;
    protected String sPhone;
    protected Date createDate;
    protected String sPosition;

    public Employee(Integer idEmployee, String sAccount, String sPassword, String sEmail, String sPhone, Date createDate, String sPosition, Integer idPerson, String sFullName, String sAddress) {
        super(idPerson, sFullName, sAddress);
        this.idEmployee = idEmployee;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.sEmail = sEmail;
        this.sPhone = sPhone;
        this.createDate = createDate;
        this.sPosition = sPosition;
    }

    public Employee(Integer idEmployee, String sAccount, String sPassword, String sEmail, String sPhone, Date createDate, String sPosition) {
        this.idEmployee = idEmployee;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.sEmail = sEmail;
        this.sPhone = sPhone;
        this.createDate = createDate;
        this.sPosition = sPosition;
    }

    public Employee() {
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setsPosition(String sPosition) {
        this.sPosition = sPosition;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public String getsAccount() {
        return sAccount;
    }

    public String getsPassword() {
        return sPassword;
    }

    public String getsEmail() {
        return sEmail;
    }

    public String getsPhone() {
        return sPhone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getsPosition() {
        return sPosition;
    }
}
