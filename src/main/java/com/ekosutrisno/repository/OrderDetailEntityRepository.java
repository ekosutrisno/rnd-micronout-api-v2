package com.ekosutrisno.repository;

import com.ekosutrisno.model.OrderDetailEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Order detail entity repository.
 *
 * @author Eko Sutrisno Tuesday, 12/01/2021 10:52
 */
@Repository
public interface OrderDetailEntityRepository extends CrudRepository<OrderDetailEntity, String> {

    /**
     * Find by order id list.
     *
     * @param orderId the order id
     * @return the list
     */
    List<OrderDetailEntity> findByOrderId(String orderId);
}
