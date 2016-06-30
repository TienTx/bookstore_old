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
public class CustomerMember extends Customer implements Serializable {

    private Integer idCusMember;
    private String sAccount;
    private String sPassword;
    private Date createDate;

    public void setIdCusMember(Integer idCusMember) {
        this.idCusMember = idCusMember;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIdCusMember() {
        return idCusMember;
    }

    public String getsAccount() {
        return sAccount;
    }

    public String getsPassword() {
        return sPassword;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public CustomerMember(Integer idCusMember, String sAccount, String sPassword, Date createDate) {
        this.idCusMember = idCusMember;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.createDate = createDate;
    }

    public CustomerMember(Integer idCusMember, String sAccount, String sPassword, Date createDate, Integer idCustomer, String sEmail, String sPhone, CardPoint cardPoint, Integer idPerson, String sFullName, String sAddress) {
        super(idCustomer, sEmail, sPhone, cardPoint, idPerson, sFullName, sAddress);
        this.idCusMember = idCusMember;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.createDate = createDate;
    }

    public CustomerMember(Integer idCusMember, String sAccount, String sPassword, Date createDate, Integer idCustomer, String sEmail, String sPhone, CardPoint cardPoint) {
        super(idCustomer, sEmail, sPhone, cardPoint);
        this.idCusMember = idCusMember;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.createDate = createDate;
    }

    public CustomerMember() {
    }
}
