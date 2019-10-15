package com.example.allocation.Order;

public class OrderLineDto {

        private Long id;
        private String orderLineId;
        private Boolean isCancelled;
        private String itemId;
        private Integer unitPrice;
        private Integer quantity;
        private String deliveryMethodId;

        private ShippingToAddress shippingToAddress;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getOrderLineId() {
            return orderLineId;
        }

        public void setOrderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
        }

        public Boolean getIsCancelled() {
            return isCancelled;
        }

        public void setIsCancelled(Boolean isCancelled) {
            this.isCancelled = isCancelled;
        }

        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }

        public Integer getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Integer unitPrice) {
            this.unitPrice = unitPrice;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getDeliveryMethodId() {
            return deliveryMethodId;
        }

        public void setDeliveryMethodId(String deliveryMethodId) {
            this.deliveryMethodId = deliveryMethodId;
        }

        public ShippingToAddress getShippingToAddress() {
            return shippingToAddress;
        }

        public void setShippingToAddress(ShippingToAddress shippingToAddress) {
            this.shippingToAddress = shippingToAddress;
        }


}
