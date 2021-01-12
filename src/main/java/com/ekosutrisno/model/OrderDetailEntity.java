package com.ekosutrisno.model;

import javax.persistence.*;
import java.util.UUID;

/**
 * The type Order detail entity.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 10:39
 */
@Entity
@Table(name = OrderDetailEntity.TABLE_NAME)
public class OrderDetailEntity {
    /**
     * The Table name.
     */
    static final String TABLE_NAME = "t_order_detail";

    @Id
    @Column(name = "order_detail_id", nullable = false, length = 36)
    private String orderDetailId = UUID.randomUUID().toString();

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "order_detail_item", nullable = false)
    private String orderDetailItem;

    @Column(name = "order_detail_item_quantity", nullable = false)
    private Integer orderDetailItemQuantity;

    @Column(name = "order_detail_item_price", nullable = false)
    private Double orderDetailItemPrice;

    @Column(name = "order_detail_merchant", nullable = false)
    private String orderDetailMerchant;

    /**
     * Instantiates a new Order detail entity.
     */
    public OrderDetailEntity() {
    }

    /**
     * Instantiates a new Order detail entity.
     *
     * @param orderDetailId           the order detail id
     * @param orderId                 the order id
     * @param orderDetailItem         the order detail item
     * @param orderDetailItemQuantity the order detail item quantity
     * @param orderDetailItemPrice    the order detail item price
     * @param orderDetailMerchant     the order detail merchant
     */
    public OrderDetailEntity(String orderDetailId, String orderId, String orderDetailItem, Integer orderDetailItemQuantity, Double orderDetailItemPrice, String orderDetailMerchant) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.orderDetailItem = orderDetailItem;
        this.orderDetailItemQuantity = orderDetailItemQuantity;
        this.orderDetailItemPrice = orderDetailItemPrice;
        this.orderDetailMerchant = orderDetailMerchant;
    }

    /**
     * Instantiates a new Order detail entity.
     *
     * @param orderId                 the order id
     * @param orderDetailItem         the order detail item
     * @param orderDetailItemQuantity the order detail item quantity
     * @param orderDetailItemPrice    the order detail item price
     * @param orderDetailMerchant     the order detail merchant
     */
    public OrderDetailEntity(String orderId, String orderDetailItem, Integer orderDetailItemQuantity, Double orderDetailItemPrice, String orderDetailMerchant) {
        this.orderId = orderId;
        this.orderDetailItem = orderDetailItem;
        this.orderDetailItemQuantity = orderDetailItemQuantity;
        this.orderDetailItemPrice = orderDetailItemPrice;
        this.orderDetailMerchant = orderDetailMerchant;
    }

    /**
     * Gets order detail id.
     *
     * @return the order detail id
     */
    public String getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * Sets order detail id.
     *
     * @param orderDetailId the order detail id
     */
    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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
