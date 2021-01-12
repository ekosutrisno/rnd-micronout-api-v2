package com.ekosutrisno.service;

import com.ekosutrisno.model.dto.OrderDetailRequest;
import com.ekosutrisno.model.dto.OrderRequest;
import com.ekosutrisno.model.dto.OrderUpdateRequest;
import com.ekosutrisno.model.dto.WebResponse;
import io.micronaut.data.model.Pageable;

public interface OrderService {
    WebResponse getAllOrder(Pageable pageable);

    Boolean sendOrder(OrderRequest orderRequest);

    Boolean updateOrder(String orderId, OrderUpdateRequest orderUpdateRequest);

    Boolean updateOrderDetail(String orderId, String orderDetailId, OrderDetailRequest orderDetailRequest);

    Boolean cancelOrder(String orderId);
}
