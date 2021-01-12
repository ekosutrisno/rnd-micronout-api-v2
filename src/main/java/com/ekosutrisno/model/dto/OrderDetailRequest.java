package com.ekosutrisno.model.dto;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * The type Order detail request.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 11:00
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

    /**
     * Gets order detail item.
     *
     * @return the order detail item
     */
    public String getOrderDetailItem() {
        return orderDetailItem;
    }

    /**
     * Sets order detail item.
     *
     * @param orderDetailItem the order detail item
     */
    public void setOrderDetailItem(String orderDetailItem) {
        this.orderDetailItem = orderDetailItem;
    }

    /**
     * Gets order detail item quantity.
     *
     * @return the order detail item quantity
     */
    public Integer getOrderDetailItemQuantity() {
        return orderDetailItemQuantity;
    }

    /**
     * Sets order detail item quantity.
     *
     * @param orderDetailItemQuantity the order detail item quantity
     */
    public void setOrderDetailItemQuantity(Integer orderDetailItemQuantity) {
        this.orderDetailItemQuantity = orderDetailItemQuantity;
    }

    /**
     * Gets order detail item price.
     *
     * @return the order detail item price
     */
    public Double getOrderDetailItemPrice() {
        return orderDetailItemPrice;
    }

    /**
     * Sets order detail item price.
     *
     * @param orderDetailItemPrice the order detail item price
     */
    public void setOrderDetailItemPrice(Double orderDetailItemPrice) {
        this.orderDetailItemPrice = orderDetailItemPrice;
    }

    /**
     * Gets order detail merchant.
     *
     * @return the order detail merchant
     */
    public String getOrderDetailMerchant() {
        return orderDetailMerchant;
    }

    /**
     * Sets order detail merchant.
     *
     * @param orderDetailMerchant the order detail merchant
     */
    public void setOrderDetailMerchant(String orderDetailMerchant) {
        this.orderDetailMerchant = orderDetailMerchant;
    }
}
