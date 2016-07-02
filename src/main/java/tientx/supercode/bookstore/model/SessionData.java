/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.model;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author zOzDarKzOz
 */
public class SessionData implements Serializable {

    private CustomerMember cusMb;
    private Map<String, Map<Integer, SubCategory>> mapCategory;
    private Map<String, Book> mapBook;

    public SessionData() {
    }

    public void setCusMb(CustomerMember cusMb) {
        this.cusMb = cusMb;
    }

    public void setMapCategory(Map<String, Map<Integer, SubCategory>> mapCategory) {
        this.mapCategory = mapCategory;
    }

    public void setMapBook(Map<String, Book> mapBook) {
        this.mapBook = mapBook;
    }

    public CustomerMember getCusMb() {
        return cusMb;
    }

    public Map<String, Map<Integer, SubCategory>> getMapCategory() {
        return mapCategory;
    }

    public Map<String, Book> getMapBook() {
        return mapBook;
    }

    public SessionData(CustomerMember cusMb, Map<String, Map<Integer, SubCategory>> mapCategory, Map<String, Book> mapBook) {
        this.cusMb = cusMb;
        this.mapCategory = mapCategory;
        this.mapBook = mapBook;
    }
}
