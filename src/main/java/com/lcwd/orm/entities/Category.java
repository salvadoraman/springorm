package com.lcwd.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_category")
public class Category {
    @Id
    private String cid;
    private  String catname;

    //hr category ke pass multiple products

    //categories ke andar product ko manage krne ke liye new table bnegi

    @ManyToMany
    private List<Product> products=new ArrayList<>();

    public Category(String cid, String catname, List<Product> productList) {
        this.cid = cid;
        this.catname = catname;
        this.products = productList;
    }

    public Category() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public List<Product> getProductList() {
        return products;
    }

    public void setProductList(List<Product> productList) {
        this.products = productList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid='" + cid + '\'' +
                ", catname='" + catname + '\'' +
                ", productList=" + products+
                '}';
    }
}
