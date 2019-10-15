package com.example.allocation.Order;

import java.util.Set;

public class OrderDto {
    private Long id;
    private String orderId;
    private Boolean isConfirmed;
    private Boolean isCancelled;
    private CustomerDetailsDto customerDetails;

    private String orderStatus;
    private SellingChannel sellingChannel;
 //   private PaymentDto payment;
    private Set<OrderLineDto> orderLines;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }


    public CustomerDetailsDto getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetailsDto customerDetails) {
        this.customerDetails = customerDetails;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public SellingChannel getSellingChannel() {
        return sellingChannel;
    }

    public void setSellingChannel(SellingChannel sellingChannel) {
        this.sellingChannel = sellingChannel;
    }

//    public PaymentDto getPayment() {
//        return payment;
//    }
//
//    public void setPayment(PaymentDto paymentDTO) {
//        this.payment = paymentDTO;
//    }


    public Set<OrderLineDto> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLineDto> orderLines) {
        this.orderLines = orderLines;
    }
}
