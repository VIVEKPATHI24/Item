package com.example.Item;

import com.example.Item.domain.Brands;
import com.example.Item.domain.Coupons;
import com.example.Item.domain.SellingAttributes;

import java.util.List;

public class Items {
    private long id;
    private String dimensionUOM;
    private String size;
    private String itemId;
    private String shortDescription;
    private String color;
    private String weight;
    private String brand;
    private String description;
    private String height;
    private String width;
    private String weightUOM;
    private String isGiftedCard;
    private String length;
    private String price;
    private String imageURL;
 //   private String sellingAttributes_id;
//    private String handling_attributes;
//    private String brand_id;
    private List<com.example.Item.domain.Coupons> coupons;
    private com.example.Item.domain.Brands brands;
    private com.example.Item.domain.SellingAttributes sellingAttributes;
    private HandlingAttributes handlingAttributes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDimensionUOM() {
        return dimensionUOM;
    }

    public void setDimensionUOM(String dimensionUOM) {
        this.dimensionUOM = dimensionUOM;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getWeightUOM() {
        return weightUOM;
    }

    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
    }

    public String getIsGiftedCard() {
        return isGiftedCard;
    }

    public void setIsGiftedCard(String isGiftedCard) {
        this.isGiftedCard = isGiftedCard;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<com.example.Item.domain.Coupons> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupons> coupons) {
        this.coupons = coupons;
    }

    public com.example.Item.domain.Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    public com.example.Item.domain.SellingAttributes getSellingAttributes() {
        return sellingAttributes;
    }

    public void setSellingAttributes(SellingAttributes sellingAttributes) {
        this.sellingAttributes = sellingAttributes;
    }

    public HandlingAttributes getHandlingAttributes() {
        return handlingAttributes;
    }

    public void setHandlingAttributes(HandlingAttributes handlingAttributes) {
        this.handlingAttributes = handlingAttributes;
    }

}
