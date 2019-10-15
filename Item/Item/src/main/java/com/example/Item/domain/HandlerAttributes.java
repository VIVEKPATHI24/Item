package com.example.Item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HandlerAttributes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long handlingAttributeId;
    private boolean isHazard;
    private boolean isParcelShippingAllowed;
    private boolean isAirShippingAllowed;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getHandlingAttributesId() {
        return handlingAttributeId;
    }

    public void setHandlingAttributesId(long handlingAttributesId) {
        this.handlingAttributeId = handlingAttributesId;
    }

    public boolean isHazard() {
        return isHazard;
    }

    public void setHazard(boolean hazard) {
        isHazard = hazard;
    }

    public boolean isParcelShippingAllowed() {
        return isParcelShippingAllowed;
    }

    public void setParcelShippingAllowed(boolean parcelShippingAllowed) {
        isParcelShippingAllowed = parcelShippingAllowed;
    }

    public boolean isAirShippingAllowed() {
        return isAirShippingAllowed;
    }

    public void setAirShippingAllowed(boolean airShippingAllowed) {
        isAirShippingAllowed = airShippingAllowed;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    private boolean isFrozen;
}
