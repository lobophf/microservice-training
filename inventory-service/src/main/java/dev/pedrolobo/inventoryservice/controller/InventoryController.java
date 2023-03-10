package dev.pedrolobo.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import dev.pedrolobo.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;

@RequestMapping(path = "/api/inventory")
@RequiredArgsConstructor
public class InventoryController{

  private InventoryService inventoryService;

  @GetMapping("/{sku-code}")
  @ResponseStatus(HttpStatus.OK)
  public boolean isInStock(@PathVariable("sku-code") String skuCode){
    return inventoryService.isInStock(skuCode);
  }

}
