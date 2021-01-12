package com.ekosutrisno.service.impl;

import com.ekosutrisno.model.OrderEntity;
import com.ekosutrisno.model.dto.OrderRequest;
import com.ekosutrisno.repository.OrderDetailEntityRepository;
import com.ekosutrisno.repository.OrderEntityRepository;
import com.ekosutrisno.service.OrderService;
import io.micronaut.data.model.Pageable;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:04
 */
@Singleton
public class OrderServiceImpl implements OrderService {

    private final OrderEntityRepository orderRepository;
    private final OrderDetailEntityRepository orderDetailRepository;

    @Inject
    public OrderServiceImpl(OrderEntityRepository orderRepository, OrderDetailEntityRepository orderDetailRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public Iterable<OrderEntity> getAllOrder(Pageable pageable) {
        orderDetailRepository.findAll();
        return orderRepository.findAll();
    }

    @Override
    public Boolean sendOrder(OrderRequest orderRequest) {
        return null;
    }
}
