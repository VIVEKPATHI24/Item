package com.example.allocation.Release;

public class ReleaseLine {
    private Long id;
    private String itemId;
    private String quantity;
    private String fulfillmentQuantity;
    private String cancelledQuantity;
    private String orderLineId;
    private String status;
    private FulfillmentDetail fulfillmentDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFulfillmentQuantity() {
        return fulfillmentQuantity;
    }

    public void setFulfillmentQuantity(String fulfillmentQuantity) {
        this.fulfillmentQuantity = fulfillmentQuantity;
    }

    public String getCancelledQuantity() {
        return cancelledQuantity;
    }

    public void setCancelledQuantity(String cancelledQuantity) {
        this.cancelledQuantity = cancelledQuantity;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FulfillmentDetail getFulfillmentDetail() {
        return fulfillmentDetail;
    }

    public void setFulfillmentDetail(FulfillmentDetail fulfillmentDetail) {
        this.fulfillmentDetail = fulfillmentDetail;
    }
}
