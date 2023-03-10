package dev.pedrolobo.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pedrolobo.orderservice.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Long> {

}
