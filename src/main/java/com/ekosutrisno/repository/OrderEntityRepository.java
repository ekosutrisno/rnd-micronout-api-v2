package com.ekosutrisno.repository;

import com.ekosutrisno.model.OrderEntity;
import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.data.repository.PageableRepository;

import javax.annotation.Nonnull;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 10:51
 */
@Repository
public interface OrderEntityRepository extends CrudRepository<OrderEntity, String>, PageableRepository<OrderEntity, String> {

    @NonNull
    @Override
    @Query(value = "select o from OrderEntity o where o.status = true", countQuery = "select count(o.orderId) from OrderEntity o where o.status = true")
    Page<OrderEntity> findAll(@Nonnull Pageable pageable);
}
