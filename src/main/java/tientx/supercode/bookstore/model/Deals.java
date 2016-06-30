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
public class Deals implements Serializable {

    private Integer idDeals;
    private String sCode;
    private String sDescription;
    private Integer iDiscount;
    private Date startDate;
    private Date endDate;
    private Integer iStatus;

    public void setIdDeals(Integer idDeals) {
        this.idDeals = idDeals;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public void setiDiscount(Integer iDiscount) {
        this.iDiscount = iDiscount;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setiStatus(Integer iStatus) {
        this.iStatus = iStatus;
    }

    public Integer getIdDeals() {
        return idDeals;
    }

    public String getsCode() {
        return sCode;
    }

    public String getsDescription() {
        return sDescription;
    }

    public Integer getiDiscount() {
        return iDiscount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Integer getiStatus() {
        return iStatus;
    }

    public Deals(Integer idDeals, String sCode, String sDescription, Integer iDiscount, Date startDate, Date endDate, Integer iStatus) {
        this.idDeals = idDeals;
        this.sCode = sCode;
        this.sDescription = sDescription;
        this.iDiscount = iDiscount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.iStatus = iStatus;
    }

    public Deals() {
    }
}
