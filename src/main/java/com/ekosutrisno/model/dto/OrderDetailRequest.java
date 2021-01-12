package com.ekosutrisno.model.dto;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:00
 */
public class OrderDetailRequest {
    private String orderDetailItem;
    private Integer orderDetailItemQuantity;
    private Double orderDetailItemPrice;
    private String orderDetailMerchant;

    public String getOrderDetailItem() {
        return orderDetailItem;
    }

    public void setOrderDetailItem(String orderDetailItem) {
        this.orderDetailItem = orderDetailItem;
    }

    public Integer getOrderDetailItemQuantity() {
        return orderDetailItemQuantity;
    }

    public void setOrderDetailItemQuantity(Integer orderDetailItemQuantity) {
        this.orderDetailItemQuantity = orderDetailItemQuantity;
    }

    public Double getOrderDetailItemPrice() {
        return orderDetailItemPrice;
    }

    public void setOrderDetailItemPrice(Double orderDetailItemPrice) {
        this.orderDetailItemPrice = orderDetailItemPrice;
    }

    public String getOrderDetailMerchant() {
        return orderDetailMerchant;
    }

    public void setOrderDetailMerchant(String orderDetailMerchant) {
        this.orderDetailMerchant = orderDetailMerchant;
    }
}
