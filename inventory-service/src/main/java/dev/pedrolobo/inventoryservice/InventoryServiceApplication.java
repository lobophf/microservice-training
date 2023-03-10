package dev.pedrolobo.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.pedrolobo.inventoryservice.model.Inventory;
import dev.pedrolobo.inventoryservice.repository.IInventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

  @Bean
  public CommandLineRunner loadData(IInventoryRepository inventoryRepository){
    return args -> {
      Inventory inventory = new Inventory(); 
      inventory.setSkuCode("banana");
      inventory.setQuantity(2);

      Inventory inventory2 = new Inventory(); 
      inventory2.setSkuCode("apple");
      inventory2.setQuantity(0);

      inventoryRepository.save(inventory);
      inventoryRepository.save(inventory2);

    };
  }

}
