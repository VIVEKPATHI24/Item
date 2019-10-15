package com.example.allocation.Release;

public class FulfillmentDetail {
    private Long id;
    private String shipmentId;
    private String trackingNumber;
    private String packageDetailId;
    private String fulfillmentDate;
    private String itemId;
    private String fulfillmentId;
    private String quantity;
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getPackageDetailId() {
        return packageDetailId;
    }

    public void setPackageDetailId(String packageDetailId) {
        this.packageDetailId = packageDetailId;
    }

    public String getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(String fulfillmentDate) {
        this.fulfillmentDate = fulfillmentDate;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getFulfillmentId() {
        return fulfillmentId;
    }

    public void setFulfillmentId(String fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
