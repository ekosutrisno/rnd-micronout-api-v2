package com.ekosutrisno.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * The type Order request.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 10:59
 */
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
    public List<OrderDetailRequest> getOrderDetail() {
        return orderDetail;
    }

    /**
     * Sets order detail.
     *
     * @param orderDetail the order detail
     */
    public void setOrderDetail(List<OrderDetailRequest> orderDetail) {
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
}