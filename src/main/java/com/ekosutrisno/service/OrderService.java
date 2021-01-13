package com.ekosutrisno.service;

import com.ekosutrisno.model.dto.*;
import io.micronaut.data.model.Pageable;

public interface OrderService {
    WebResponse getAllOrder(Pageable pageable);

    ResponseOrder getOneOrderById(String orderId);

    Boolean sendOrder(OrderRequest orderRequest);

    Boolean updateOrder(String orderId, OrderUpdateRequest orderUpdateRequest);

    Boolean updateOrderDetail(String orderId, String orderDetailId, OrderDetailRequest orderDetailRequest);

    Boolean cancelOrder(String orderId);
}
