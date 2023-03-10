package dev.pedrolobo.orderservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.pedrolobo.orderservice.dto.OrderLineItemsDto;
import dev.pedrolobo.orderservice.dto.OrderRequest;
import dev.pedrolobo.orderservice.model.Order;
import dev.pedrolobo.orderservice.model.OrderLineItens;
import dev.pedrolobo.orderservice.repository.IOrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

  private final IOrderRepository orderRepository;

  public void placeOrder(OrderRequest orderRequest) {

    Order order = new Order();
    order.setOrderNumber(UUID.randomUUID().toString());


    List<OrderLineItens> orderLineItems = orderRequest.getOrderLineItemsDtoList()
      .stream()
      .map(this::mapToDto)
      .toList();

    order.setOrderLineItemList(orderLineItems);
    orderRepository.save(order);
  }

  private OrderLineItens mapToDto(OrderLineItemsDto orderLineItemsDto) {
    OrderLineItens orderLineItens = new OrderLineItens();
    orderLineItens.setPrice(orderLineItemsDto.getPrice());
    orderLineItens.setQuantity(orderLineItemsDto.getQuantity());
    orderLineItens.setSkuCode(orderLineItemsDto.getSkuCode());
    return orderLineItens;
  }

}
