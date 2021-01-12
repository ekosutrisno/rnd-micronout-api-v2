package com.ekosutrisno.controller;

import com.ekosutrisno.model.OrderEntity;
import com.ekosutrisno.service.OrderService;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;

import static io.micronaut.http.HttpStatus.OK;
import static io.micronaut.http.MediaType.APPLICATION_JSON;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:08
 */
@Controller("/api/${api.version:v1}/orders")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class OrderController {
    @Inject
    private OrderService orderService;

    @Get
    @Status(OK)
    public Iterable<OrderEntity> retrieveAllOrder() {
        return orderService.getAllOrder(null) ;
    }

}
