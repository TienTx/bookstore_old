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
public class SubCategory implements Serializable {

    private Integer idSubCt;
    private String sName;
    private String sDescription;
    private String sLink;

    public SubCategory() {
    }

    public SubCategory(Integer idSubCt, String sName, String sDescription, String sLink) {
        this.idSubCt = idSubCt;
        this.sName = sName;
        this.sDescription = sDescription;
        this.sLink = sLink;
    }

    public Integer getIdSubCt() {
        return idSubCt;
    }

    public String getsName() {
        return sName;
    }

    public String getsDescription() {
        return sDescription;
    }

    public String getsLink() {
        return sLink;
    }

    public void setIdSubCt(Integer idSubCt) {
        this.idSubCt = idSubCt;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public void setsLink(String sLink) {
        this.sLink = sLink;
    }

}
