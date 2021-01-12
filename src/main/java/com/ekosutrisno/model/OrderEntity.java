package com.ekosutrisno.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * The type Order entity.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 10:33
 */
@Entity
@Table(
        name = OrderEntity.TABLE_NAME,
        uniqueConstraints = @UniqueConstraint(name = "invoice_number_unique", columnNames = "invoice_number")
)
public class OrderEntity {
    /**
     * The Table name.
     */
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

    /**
     * Instantiates a new Order entity.
     */
    public OrderEntity() {
    }

    /**
     * Instantiates a new Order entity.
     *
     * @param orderId          the order id
     * @param invoiceNumber    the invoice number
     * @param orderName        the order name
     * @param orderDescription the order description
     * @param createdDate      the created date
     * @param createdBy        the created by
     * @param modifiedDate     the modified date
     * @param modifiedBy       the modified by
     * @param status           the status
     */
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

    /**
     * Gets status.
     *
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
