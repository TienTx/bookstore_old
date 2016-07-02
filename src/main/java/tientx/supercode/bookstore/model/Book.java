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
public class Book implements Serializable {

    private Integer idBook;
    private String sTitle;
    private String sAuthor;
    private String sPublisher;
    private String sPublishYear;
    private String sCoverImg;
    private String sDescription;
    private String sOriginalPrice;
    private String sSalePrice;
    private Integer iQuantity;
    private Integer iVote;
    private Integer iRate;
    private String sLink;
    private Integer status;
    private SubCategory category;
    private List<Deals> listDeals;

    public Book() {
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public void setsAuthor(String sAuthor) {
        this.sAuthor = sAuthor;
    }

    public void setsPublisher(String sPublisher) {
        this.sPublisher = sPublisher;
    }

    public void setsPublishYear(String sPublishYear) {
        this.sPublishYear = sPublishYear;
    }

    public void setsCoverImg(String sCoverImg) {
        this.sCoverImg = sCoverImg;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public void setsOriginalPrice(String sOriginalPrice) {
        this.sOriginalPrice = sOriginalPrice;
    }

    public void setsSalePrice(String sSalePrice) {
        this.sSalePrice = sSalePrice;
    }

    public void setiQuantity(Integer iQuantity) {
        this.iQuantity = iQuantity;
    }

    public void setiVote(Integer iVote) {
        this.iVote = iVote;
    }

    public void setiRate(Integer iRate) {
        this.iRate = iRate;
    }

    public void setsLink(String sLink) {
        this.sLink = sLink;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCategory(SubCategory category) {
        this.category = category;
    }

    public void setListDeals(List<Deals> listDeals) {
        this.listDeals = listDeals;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public String getsTitle() {
        return sTitle;
    }

    public String getsAuthor() {
        return sAuthor;
    }

    public String getsPublisher() {
        return sPublisher;
    }

    public String getsPublishYear() {
        return sPublishYear;
    }

    public String getsCoverImg() {
        return sCoverImg;
    }

    public String getsDescription() {
        return sDescription;
    }

    public String getsOriginalPrice() {
        return sOriginalPrice;
    }

    public String getsSalePrice() {
        return sSalePrice;
    }

    public Integer getiQuantity() {
        return iQuantity;
    }

    public Integer getiVote() {
        return iVote;
    }

    public Integer getiRate() {
        return iRate;
    }

    public String getsLink() {
        return sLink;
    }

    public Integer getStatus() {
        return status;
    }

    public SubCategory getCategory() {
        return category;
    }

    public List<Deals> getListDeals() {
        return listDeals;
    }

    public Book(Integer idBook, String sTitle, String sAuthor, String sPublisher, String sPublishYear, String sCoverImg, String sDescription, String sOriginalPrice, String sSalePrice, Integer iQuantity, Integer iVote, Integer iRate, String sLink, Integer status, SubCategory category, List<Deals> listDeals) {
        this.idBook = idBook;
        this.sTitle = sTitle;
        this.sAuthor = sAuthor;
        this.sPublisher = sPublisher;
        this.sPublishYear = sPublishYear;
        this.sCoverImg = sCoverImg;
        this.sDescription = sDescription;
        this.sOriginalPrice = sOriginalPrice;
        this.sSalePrice = sSalePrice;
        this.iQuantity = iQuantity;
        this.iVote = iVote;
        this.iRate = iRate;
        this.sLink = sLink;
        this.status = status;
        this.category = category;
        this.listDeals = listDeals;
    }
}
