package com.example.Item;

public class SellingAttributes {
    private long id;
    private long sellingAttributesId;
    private boolean shipToAddress;
    private boolean isExchangable;
    private boolean soldInStore;
    private boolean isTaxable;
    private boolean activationRequired;
    private boolean shipToStore;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSellingAttributesId() {
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

    public boolean isSoldInStore() {
        return soldInStore;
    }

    public void setSoldInStore(boolean soldInStore) {
        this.soldInStore = soldInStore;
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
