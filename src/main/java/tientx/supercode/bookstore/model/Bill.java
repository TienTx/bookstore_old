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
public class Bill implements Serializable {

    private Integer idBill;
    private Date date;
    private Employee employee;
    private Order order;

    public void setIdBill(Integer idBill) {
        this.idBill = idBill;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getIdBill() {
        return idBill;
    }

    public Date getDate() {
        return date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Order getOrder() {
        return order;
    }

    public Bill(Integer idBill, Date date, Employee employee, Order order) {
        this.idBill = idBill;
        this.date = date;
        this.employee = employee;
        this.order = order;
    }

    public Bill() {
    }
}
