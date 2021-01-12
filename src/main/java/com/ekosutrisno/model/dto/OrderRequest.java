package com.ekosutrisno.model.dto;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:59
 */
@Introspected
public class OrderRequest {
    @NotNull
    @NotBlank
    private String orderName;
    private List<OrderDetailRequest> orderDetail;
    private String orderDescription;

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