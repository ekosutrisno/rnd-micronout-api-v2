package com.ekosutrisno.model.dto;

import com.ekosutrisno.model.OrderDetailEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * The type Response order.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 11:53
 */
public class ResponseOrder {
    @JsonProperty(index = 0)
    private String orderId;
    @JsonProperty(index = 1)
    private String invoiceNumber;
    @JsonProperty(index = 2)
    private String orderName;
    @JsonProperty(index = 3)
    private List<OrderDetailEntity> orderDetail;
    @JsonProperty(index = 4)
    private String orderDescription;
    @JsonProperty(index = 5)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+07")
    private Date createdDate;
    @JsonProperty(index = 6)
    private String createdBy;
    @JsonProperty(index = 7)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+07")
    private Date modifiedDate;
    @JsonProperty(index = 8)
    private String modifiedBy;

    /**
     * Instantiates a new Response order.
     *
     * @param orderId          the order id
     * @param invoiceNumber    the invoice number
     * @param orderName        the order name
     * @param orderDetail      the order detail
     * @param orderDescription the order description
     * @param createdDate      the created date
     * @param createdBy        the created by
     * @param modifiedDate     the modified date
     * @param modifiedBy       the modified by
     */
    public ResponseOrder(String orderId, String invoiceNumber, String orderName, List<OrderDetailEntity> orderDetail, String orderDescription, Date createdDate, String createdBy, Date modifiedDate, String modifiedBy) {
        this.orderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.orderName = orderName;
        this.orderDetail = orderDetail;
        this.orderDescription = orderDescription;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
    }

    /**
     * Instantiates a new Response order.
     */
    public ResponseOrder() {
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
     * Gets invoice number.
     *
     * @return the invoice number
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets invoice number.
     *
     * @param invoiceNumber the invoice number
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * Gets order name.
     *
     * @return the order name
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets order name.
     *
     * @param orderName the order name
     */
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    /**
     * Gets order detail.
     *
     * @return the order detail
     */
    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets order detail.
     *
     * @param orderDetail the order detail
     */
    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }

    /**
     * Gets order description.
     *
     * @return the order description
     */
    public String getOrderDescription() {
        return orderDescription;
    }

    /**
     * Sets order description.
     *
     * @param orderDescription the order description
     */
    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    /**
     * Gets created date.
     *
     * @return the created date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets created date.
     *
     * @param createdDate the created date
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets modified date.
     *
     * @return the modified date
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets modified date.
     *
     * @param modifiedDate the modified date
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Gets modified by.
     *
     * @return the modified by
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets modified by.
     *
     * @param modifiedBy the modified by
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
