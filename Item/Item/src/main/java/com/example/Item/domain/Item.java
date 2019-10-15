package com.example.Item.domain;

import com.example.Item.domain.common.ItemStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
//@JsonIgnoreType
public class Item {


    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemId;
    private String dimensionUOM;
    private Long size1;
    private String baseUOM;
    private String shortDescription;
    private String color;
    private String weight;
    private String weightUOM;
  //private String brand;
    private String description;
    private Long height;
    private Long width;
    private boolean isGiftCard;
    private Long length;
    private Long price;
    private String imageURL;


    public void setId(Long id) {
        this.id = id;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

//    private List<Coupons> couponsList;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonIgnoreProperties("item")
    private Brands brands;

    @OneToOne(cascade = CascadeType.ALL)
    private SellingAttributes sellingAttribute;

    @OneToOne(cascade = CascadeType.ALL)
    private HandlerAttributes handlerAttribute;

    public List<Coupons> getCoupons() {
        return coupons;
    }

    @ManyToMany()
    @JsonIgnoreProperties("items")
    @JoinTable(name = "coupon_item", joinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    private List<Coupons> coupons;

    public void setCoupons(List<Coupons> coupons) {
        this.coupons = coupons;
    }

    public Long getId() {
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

    public Long getSize1() {
        return size1;
    }

    public void setSize1(Long size1) {
        this.size1 = size1;
    }

    public String getBaseUOM() {
        return baseUOM;
    }

    public void setBaseUOM(String baseUOM) {
        this.baseUOM = baseUOM;
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

    public String getWeightUOM() {
        return weightUOM;
    }

    public void setWeightUOM(String weightUOM) {
        this.weightUOM = weightUOM;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public boolean isGiftCard() {
        return isGiftCard;
    }

    public void setGiftCard(boolean giftCard) {
        isGiftCard = giftCard;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public HandlerAttributes getHandlerAttribute() {
        return handlerAttribute;
    }


    public void setHandlerAttribute(HandlerAttributes handlerAttribute) {
        this.handlerAttribute = handlerAttribute;
    }

    public SellingAttributes getSellingAttribute() {
        return sellingAttribute;
    }

    public void setSellingAttribute(SellingAttributes sellingAttribute) {
        this.sellingAttribute = sellingAttribute;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }
}
