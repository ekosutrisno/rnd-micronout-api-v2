package com.ekosutrisno.controller;

import com.ekosutrisno.model.dto.OrderRequest;
import com.ekosutrisno.model.dto.WebResponse;
import com.ekosutrisno.service.OrderService;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.inject.Inject;
import javax.validation.Valid;

import java.util.HashMap;
import java.util.Map;

import static io.micronaut.http.HttpStatus.CREATED;
import static io.micronaut.http.HttpStatus.OK;
import static io.micronaut.http.MediaType.APPLICATION_JSON;

/**
 * @author Eko Sutrisno
 * Tuesday, 12/01/2021 11:08
 */
@Validated
@Controller("/api/${api.version:v1}/orders")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@Tag(name = "Order Service", description = "Handling All Order Service")
public class OrderController {
    @Inject
    private OrderService orderService;

    @Get
    @Status(OK)
    @Operation(summary = "Get All Order", description = "Get all order with status True")
    public WebResponse retrieveAllOrder(@QueryValue(value = "page", defaultValue = "0") int page,
                                        @QueryValue(value = "size", defaultValue = "10") int size) {

        Pageable pageable = Pageable.from(page, size);

        return orderService.getAllOrder(pageable);
    }

    @Post
    @Status(CREATED)
    public Map<String, Object> sendOrder(@Valid @Body OrderRequest orderRequest) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", orderService.sendOrder(orderRequest));
        response.put("message", "Order has been Sent.");

        return response;
    }

}
