package com.ekosutrisno.controller;

import com.ekosutrisno.model.dto.*;
import com.ekosutrisno.service.OrderService;
import io.micronaut.data.model.Pageable;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static io.micronaut.http.HttpStatus.CREATED;
import static io.micronaut.http.HttpStatus.OK;
import static io.micronaut.http.MediaType.APPLICATION_JSON;

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
    @Operation(summary = "Send Order", description = "Send and create order")
    public ResponseInfo sendOrder(@Valid @Body OrderRequest orderRequest) {
        String MESSAGE = "Order has been Sent.";
        return new ResponseInfo(
                orderService.sendOrder(orderRequest),
                MESSAGE,
                new Date()
        );
    }

    @Put("/{orderId}")
    @Status(OK)
    @Operation(summary = "Update Order", description = "Update orderName and orderDescription")
    public ResponseInfo updateOrder(@PathVariable("orderId") @NotNull String orderId,
                                    @Valid @Body OrderUpdateRequest orderRequest) {

        String MESSAGE = "Order has been Updated.";
        return new ResponseInfo(
                orderService.updateOrder(orderId, orderRequest),
                MESSAGE,
                new Date()
        );
    }

    @Put("/{orderId}/{orderDetailId}")
    @Status(OK)
    @Operation(summary = "Update OrderDetail", description = "Update order detail")
    public ResponseInfo updateOrder(@PathVariable("orderId") @NotNull String orderId,
                                    @PathVariable("orderDetailId") @NotNull String orderDetailId,
                                    @Valid @Body OrderDetailRequest orderDetailRequest) {

        String MESSAGE = "Order Detail has been Updated.";
        return new ResponseInfo(
                orderService.updateOrderDetail(orderId, orderDetailId, orderDetailRequest),
                MESSAGE,
                new Date()
        );
    }

    @Delete("/{orderId}")
    @Status(OK)
    @Operation(summary = "Cancel Order", description = "Cancel Order and set Status = false")
    public ResponseInfo updateOrder(@PathVariable("orderId") @NotNull String orderId) {

        String MESSAGE = "Order Detail has been Canceled.";
        return new ResponseInfo(
                orderService.cancelOrder(orderId),
                MESSAGE,
                new Date()
        );
    }
}
