package com.example.Item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SellingAttributes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sellingAttributesId;
    private boolean shipToAddress;
    private boolean isExchangable;
    private boolean soldOnLine;
    private boolean soldOnStore;
    private boolean isTaxable;
    private boolean activationRequired;
    private boolean shipToStore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSellingAttributesId() {
        return sellingAttributesId;
    }

    public void setSellingAttributesId(long sellingAttributesId) {
        this.sellingAttributesId = sellingAttributesId;
    }

    public boolean isShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(boolean shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public boolean isExchangable() {
        return isExchangable;
    }

    public void setExchangable(boolean exchangable) {
        isExchangable = exchangable;
    }

    public boolean isSoldOnLine() {
        return soldOnLine;
    }

    public void setSoldOnLine(boolean soldOnLine) {
        this.soldOnLine = soldOnLine;
    }

    public boolean isSoldOnStore() {
        return soldOnStore;
    }

    public void setSoldOnStore(boolean soldOnStore) {
        this.soldOnStore = soldOnStore;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public boolean isActivationRequired() {
        return activationRequired;
    }

    public void setActivationRequired(boolean activationRequired) {
        this.activationRequired = activationRequired;
    }

    public boolean isShipToStore() {
        return shipToStore;
    }

    public void setShipToStore(boolean shipToStore) {
        this.shipToStore = shipToStore;
    }


}
