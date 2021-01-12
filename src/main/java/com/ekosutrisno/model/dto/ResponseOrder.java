package com.ekosutrisno.model.dto;

import com.ekosutrisno.model.OrderDetailEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:53
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

    public ResponseOrder() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
