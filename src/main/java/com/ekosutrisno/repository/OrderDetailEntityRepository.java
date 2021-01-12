package com.ekosutrisno.repository;

import com.ekosutrisno.model.OrderDetailEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:52
 */
@Repository
public interface OrderDetailEntityRepository extends CrudRepository<OrderDetailEntity, String> {

}
