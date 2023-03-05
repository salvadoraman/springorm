package com.lcwd.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_product")
public class Product {
    @Id
    private String prodid;
    private String prodname;

    //hr prodcy ke pass many category hoga
    @ManyToMany(mappedBy ="products",cascade=CascadeType.ALL)
    private List<Category> categories = new ArrayList<>();

    public Product(String prodid, String prodname, List<Category> categories) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.categories = categories;
    }

    public Product() {
    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid='" + prodid + '\'' +
                ", prodname='" + prodname + '\'' +
                ", categories=" + categories +
                '}';
    }
}