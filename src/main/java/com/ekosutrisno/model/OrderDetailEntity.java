package com.ekosutrisno.model;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:39
 */

@Entity
@Table(name = OrderDetailEntity.TABLE_NAME,
        uniqueConstraints = @UniqueConstraint(name = "order_id_unique", columnNames = "order_id")
)
public class OrderDetailEntity {
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

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderDetailId, String orderId, String orderDetailItem, Integer orderDetailItemQuantity, Double orderDetailItemPrice, String orderDetailMerchant) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.orderDetailItem = orderDetailItem;
        this.orderDetailItemQuantity = orderDetailItemQuantity;
        this.orderDetailItemPrice = orderDetailItemPrice;
        this.orderDetailMerchant = orderDetailMerchant;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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
