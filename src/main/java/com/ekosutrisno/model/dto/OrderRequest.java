package com.ekosutrisno.model.dto;

import java.util.List;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:59
 */
public class OrderRequest {
    private String invoiceNumber;
    private String orderName;
    private List<OrderDetailRequest> orderDetail;
    private String orderDescription;

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

    public List<OrderDetailRequest> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailRequest> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}