package com.ekosutrisno.service.impl;

import com.ekosutrisno.model.OrderDetailEntity;
import com.ekosutrisno.model.OrderEntity;
import com.ekosutrisno.model.dto.*;
import com.ekosutrisno.repository.OrderDetailEntityRepository;
import com.ekosutrisno.repository.OrderEntityRepository;
import com.ekosutrisno.service.OrderService;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    public WebResponse getAllOrder(Pageable pageable) {
        Page<OrderEntity> orderEntityPage = orderRepository.findAll(pageable);

        List<ResponseOrder> responseOrders = new ArrayList<>();

        orderEntityPage.forEach(orderEntity -> {
            responseOrders.add(
                    new ResponseOrder(
                            orderEntity.getOrderId(),
                            orderEntity.getInvoiceNumber(),
                            orderEntity.getOrderName(),
                            orderDetailRepository.findByOrderId(orderEntity.getOrderId()),
                            orderEntity.getOrderDescription(),
                            orderEntity.getCreatedDate(),
                            orderEntity.getCreatedBy(),
                            orderEntity.getModifiedDate(),
                            orderEntity.getModifiedBy()
                    )
            );
        });

        WebResponse webResponse = new WebResponse();
        webResponse.setApiVersion("v0.0.1");
        webResponse.setOrganization("ExoApp, Inc");
        webResponse.setData(responseOrders);
        webResponse.setItemPerPage(orderEntityPage.getSize());
        webResponse.setTotalItems(orderEntityPage.getTotalSize());
        webResponse.setPageIndex(orderEntityPage.getOffset());
        webResponse.setTotalPages(orderEntityPage.getTotalPages());

        return webResponse;
    }

    @Override
    @Transactional(value = Transactional.TxType.REQUIRED)
    public Boolean sendOrder(OrderRequest orderRequest) {
        OrderEntity order = new OrderEntity();

        order.setOrderName(orderRequest.getOrderName());
        order.setOrderDescription(orderRequest.getOrderDescription());

        order.setCreatedBy("EXO-BOOT-CR-3301");
        order.setCreatedDate(new Date());
        order.setModifiedBy("EXO-BOOT-MD-3301");
        order.setModifiedDate(new Date());

        String orderId = orderRepository.save(order).getOrderId();

        orderRequest.getOrderDetail().forEach(orderDetailRequest -> {
            orderDetailRepository.save(new OrderDetailEntity(
                    orderId,
                    orderDetailRequest.getOrderDetailItem(),
                    orderDetailRequest.getOrderDetailItemQuantity(),
                    (orderDetailRequest.getOrderDetailItemPrice() * orderDetailRequest.getOrderDetailItemQuantity()),
                    orderDetailRequest.getOrderDetailMerchant()
            ));
        });
        return Boolean.TRUE;
    }

    @Override
    public Boolean updateOrder(String orderId, OrderUpdateRequest orderUpdateRequest) {
        Optional<OrderEntity> orderOptional = orderRepository
                .findById(orderId);

        if (orderOptional.isPresent()) {

            OrderEntity order = orderOptional.get();
            order.setOrderName(orderUpdateRequest.getOrderName());
            order.setOrderDescription(orderUpdateRequest.getOrderDescription());

            order.setModifiedBy("EXO-BOOT-MDU-3301");
            order.setModifiedDate(new Date());

            orderRepository.update(order);

            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    @Override
    public Boolean updateOrderDetail(String orderId, String orderDetailId, OrderDetailRequest orderDetailRequest) {
        Optional<OrderDetailEntity> optionalOrderDetailEntity = orderDetailRepository
                .findByOrderDetailIdAndOrderId(orderDetailId, orderId);

        if (optionalOrderDetailEntity.isPresent()) {
            OrderDetailEntity orderDetail = optionalOrderDetailEntity.get();

            orderDetail.setOrderDetailItem(orderDetailRequest.getOrderDetailItem());
            orderDetail.setOrderDetailItemQuantity(orderDetailRequest.getOrderDetailItemQuantity());
            orderDetail.setOrderDetailItemPrice(orderDetailRequest.getOrderDetailItemPrice() * orderDetailRequest.getOrderDetailItemQuantity());
            orderDetail.setOrderDetailMerchant(orderDetailRequest.getOrderDetailMerchant());

            Optional<OrderEntity> order = orderRepository.findById(orderId);
            if (order.isPresent()) {
                order.get().setModifiedBy("EXO-BOOT-MDD-3301");
                order.get().setModifiedDate(new Date());

                orderRepository.update(order.get());
                orderDetailRepository.update(orderDetail);

                return Boolean.TRUE;
            }
        }

        return Boolean.FALSE;
    }

    @Override
    public Boolean cancelOrder(String orderId) {
        Optional<OrderEntity> order = orderRepository
                .findById(orderId);

        if (order.isPresent()) {
            if (order.get().getStatus()) {

                order.get().setStatus(Boolean.FALSE);
                orderRepository.update(order.get());

                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
