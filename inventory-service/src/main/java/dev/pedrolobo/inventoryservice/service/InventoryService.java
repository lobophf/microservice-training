package dev.pedrolobo.inventoryservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.pedrolobo.inventoryservice.repository.IInventoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
  private final IInventoryRepository inventoryRepository;

  @Transactional(readOnly = true)
  public boolean isInStock(String skuCode){
    return inventoryRepository.findBySkuCode(skuCode).isPresent();
  }
}

