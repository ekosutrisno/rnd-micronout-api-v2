package com.ekosutrisno.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:33
 */
@Entity
@Table(
        name = OrderEntity.TABLE_NAME,
        uniqueConstraints = @UniqueConstraint(name = "invoice_number_unique", columnNames = "invoice_number")
)
public class OrderEntity {
    static final String TABLE_NAME = "t_order";

    @Id
    @Column(name = "order_id", nullable = false, length = 36)
    private String orderId = UUID.randomUUID().toString();

    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber = "INV-TRX" + new Random().nextLong();

    @Column(name = "order_name", nullable = false)
    private String orderName;

    @Column(name = "order_description")
    private String orderDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+07")
    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    @Column(name = "created_by", nullable = false)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+07")
    @Column(name = "modified_date")
    private Date modifiedDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "status", nullable = false)
    private Boolean status = Boolean.TRUE;

    public OrderEntity() {
    }

    public OrderEntity(String orderId, String invoiceNumber, String orderName, String orderDescription, Date createdDate, String createdBy, Date modifiedDate, String modifiedBy, Boolean status) {
        this.orderId = orderId;
        this.invoiceNumber = invoiceNumber;
        this.orderName = orderName;
        this.orderDescription = orderDescription;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
        this.status = status;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
