package com.ekosutrisno.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 16:48
 */
@Introspected
public class OrderUpdateRequest {
    @JsonProperty(index = 0)
    private String orderName;
    @JsonProperty(index = 1)
    private String orderDescription;

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
}
