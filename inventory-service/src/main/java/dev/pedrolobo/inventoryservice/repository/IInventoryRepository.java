package dev.pedrolobo.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.pedrolobo.inventoryservice.model.Inventory;

public interface IInventoryRepository extends JpaRepository<Inventory, Long>{
    Optional<Inventory> findBySkuCode(String skuCode);
}
