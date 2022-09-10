package com.acs.items.api.model;

import java.util.Date;

public class Products {

    private final  int idProduct;
    private String productName;
    private String productDescription;
    private int amountToSell;
    private String productCategory;
    private String urlProductImage;
    private Date dateAddProduct;
    private static int idProductCounter;

    private Products() {
        this.idProduct = ++ Products.idProductCounter;
    }

    public Products(String productName, String productDescription, int amountToSell, String productCategory, String urlProductImage, Date dateAddProduct) {
        this();
        this.productName = productName;
        this.productDescription = productDescription;
        this.amountToSell = amountToSell;
        this.productCategory = productCategory;
        this.urlProductImage = urlProductImage;
        this.dateAddProduct = dateAddProduct;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getAmountToSell() {
        return this.amountToSell;
    }

    public void setAmountToSell(int amountToSell) {
        this.amountToSell = amountToSell;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getUrlProductImage() {
        return this.urlProductImage;
    }

    public void setUrlProductImage(String urlProductImage) {
        this.urlProductImage = urlProductImage;
    }

    public Date getDateAddProduct() {
        return this.dateAddProduct;
    }

    public void setDateAddProduct(Date dateAddProduct) {
        this.dateAddProduct = dateAddProduct;
    }
}
