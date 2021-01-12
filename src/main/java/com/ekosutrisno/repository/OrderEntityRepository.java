package com.ekosutrisno.repository;

import com.ekosutrisno.model.OrderEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:51
 */
@Repository
public interface OrderEntityRepository extends CrudRepository<OrderEntity, String> {

}
