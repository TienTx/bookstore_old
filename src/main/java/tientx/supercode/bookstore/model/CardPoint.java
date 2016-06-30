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
public class CardPoint implements Serializable {

    private Integer idCardPoint;
    private String sCode;
    private Integer point;
    private Date createDate;

    public void setIdCardPoint(Integer idCardPoint) {
        this.idCardPoint = idCardPoint;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIdCardPoint() {
        return idCardPoint;
    }

    public String getsCode() {
        return sCode;
    }

    public Integer getPoint() {
        return point;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public CardPoint(Integer idCardPoint, String sCode, Integer point, Date createDate) {
        this.idCardPoint = idCardPoint;
        this.sCode = sCode;
        this.point = point;
        this.createDate = createDate;
    }

    public CardPoint() {
    }
}
