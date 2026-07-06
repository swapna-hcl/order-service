package com.usk.resource;
import com.usk.dto.OrderRequestDto;
import com.usk.dto.OrderResponse;
import com.usk.entity.Order;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {
    public  static final Map<String, Order> STORE = new ConcurrentHashMap<>();
    @POST
    public OrderResponse createOrder(OrderRequestDto orderRequest) {

        String id = orderRequest.getId() != null && !orderRequest.getId().isBlank()
                ? orderRequest.getId()
                : UUID.randomUUID().toString();
        Order created = new Order();
        created.id = id;
        created.status="CREATED";
        created.amount = orderRequest.getAmount();

        STORE.put(id,created);
        return new OrderResponse(created.id, created.status, created.amount);
    }


    @GET
    public List<Order> getOrders() {
        return STORE.values().stream().toList();
    }

}
