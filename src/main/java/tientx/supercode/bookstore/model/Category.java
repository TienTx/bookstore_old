/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author zOzDarKzOz
 */
public class Category implements Serializable {

    private Integer idCategory;
    private String sName;
    private List<SubCategory> listSubCt;

    public Category() {
    }

    public Category(Integer idCategory, String sName, List<SubCategory> listSubCt) {
        this.idCategory = idCategory;
        this.sName = sName;
        this.listSubCt = listSubCt;
    }

    public Category(String sName, List<SubCategory> listSubCt) {
        this.sName = sName;
        this.listSubCt = listSubCt;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public String getsName() {
        return sName;
    }

    public List<SubCategory> getListSubCt() {
        return listSubCt;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setListSubCt(List<SubCategory> listSubCt) {
        this.listSubCt = listSubCt;
    }

}
