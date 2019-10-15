package com.example.Item;

public class HandlingAttributes {
    private long id;
    private long handlingAttributesId;
    private Boolean isHazard;
    private Boolean isParcelShippingAllowed;
    private Boolean isAirShippingAllowed;
    private Boolean isFrozen;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHandlingAttributesId() {
        return handlingAttributesId;
    }

    public void setHandlingAttributesId(long handlingAttributesId) {
        this.handlingAttributesId = handlingAttributesId;
    }

    public Boolean getHazard() {
        return isHazard;
    }

    public void setHazard(Boolean hazard) {
        isHazard = hazard;
    }

    public Boolean getParcelShippingAllowed() {
        return isParcelShippingAllowed;
    }

    public void setParcelShippingAllowed(Boolean parcelShippingAllowed) {
        isParcelShippingAllowed = parcelShippingAllowed;
    }

    public Boolean getAirShippingAllowed() {
        return isAirShippingAllowed;
    }

    public void setAirShippingAllowed(Boolean airShippingAllowed) {
        isAirShippingAllowed = airShippingAllowed;
    }

    public Boolean getFrozen() {
        return isFrozen;
    }

    public void setFrozen(Boolean frozen) {
        isFrozen = frozen;
    }



}
