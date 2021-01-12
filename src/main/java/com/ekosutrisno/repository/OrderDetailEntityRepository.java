package com.ekosutrisno.repository;

import com.ekosutrisno.model.OrderDetailEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderDetailEntityRepository extends CrudRepository<OrderDetailEntity, String> {

    List<OrderDetailEntity> findByOrderId(String orderId);

    Optional<OrderDetailEntity> findByOrderDetailIdAndOrderId(String orderDetailId, String orderId);
}
