package com.ekosutrisno.model.dto;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:00
 */
@Introspected
public class OrderDetailRequest {
    @NotBlank
    @NotNull
    private String orderDetailItem;
    @NotBlank
    @NotNull
    private Integer orderDetailItemQuantity;
    @NotBlank
    @NotNull
    private Double orderDetailItemPrice;
    @NotBlank
    @NotNull
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
