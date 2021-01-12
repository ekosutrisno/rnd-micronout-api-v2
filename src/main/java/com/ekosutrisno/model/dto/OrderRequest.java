package com.ekosutrisno.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Introspected
public class OrderRequest {
    @NotNull
    @NotBlank
    @JsonProperty(index = 0)
    private String orderName;
    @JsonProperty(index = 1)
    private List<OrderDetailRequest> orderDetail;
    @JsonProperty(index = 2)
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