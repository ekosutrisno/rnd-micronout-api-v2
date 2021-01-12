package com.ekosutrisno.service;

import com.ekosutrisno.model.OrderEntity;
import com.ekosutrisno.model.dto.OrderRequest;
import io.micronaut.data.model.Pageable;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:56
 */
public interface OrderService {
    Iterable<OrderEntity> getAllOrder(Pageable pageable);

    Boolean sendOrder(OrderRequest orderRequest);
}
